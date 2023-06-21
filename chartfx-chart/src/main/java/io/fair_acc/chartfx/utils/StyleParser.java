package io.fair_acc.chartfx.utils;

import io.fair_acc.chartfx.XYChartCss;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Some helper routines to parse CSS-style formatting attributes
 *
 * @author rstein
 */
public final class StyleParser { // NOPMD

    private static final Logger LOGGER = LoggerFactory.getLogger(StyleParser.class);
    private static final int DEFAULT_FONT_SIZE = 18;
    private static final String DEFAULT_FONT = "Helvetica";
    private static final Pattern AT_LEAST_ONE_WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final Pattern QUOTES_PATTERN = Pattern.compile("[\"']");
    /**
     * properties are split with '=' or ':'
     */
    private static final Pattern STYLE_ASSIGNMENT_PATTERN = Pattern.compile("[=:]");

    private StyleParser() {}

    /**
     * Return the property value of given property name
     *
     * @param style style string to parse
     * @param key   property key
     * @return property value, null if the style or key is null
     */
    public static String getPropertyValue(final String style, final String key) {
        if (style == null || key == null) {
            return null;
        }
        final Map<String, String> map = StyleParser.splitIntoMap(style);
        return map.get(key.toLowerCase(Locale.UK));
    }

    /**
     * parse the <code>style</code> and return value of given key, the defaultValue if null.
     *
     * @param style        style string
     * @param key          property key
     * @param defaultValue default value
     * @return property value of the key
     */
    public static String getPropertyValue(final String style, final String key, String defaultValue) {
        final String result = getPropertyValue(style, key);
        return result != null ? result : defaultValue;
    }

    /**
     * parse the style and return boolean value of the key
     *
     * @param style style, such as "booleanProperty=true", "booleanProperty=false"
     * @param key   property, such as "booleanProperty"
     * @return boolean value
     */
    public static Boolean getBooleanPropertyValue(final String style, final String key) {
        final String value = getPropertyValue(style, key);
        if (value == null) {
            return null;
        }

        return Boolean.parseBoolean(value);
    }

    /**
     * parse the style and return the property value in Color type.
     *
     * @param style style to parse
     * @param key   property key
     * @return property value in Color type
     */
    public static Color getColorPropertyValue(final String style, final String key) {
        final String value = getPropertyValue(style, key);
        if (value == null) {
            return null;
        }
        try {
            return Color.web(value);
        } catch (final IllegalArgumentException ex) {
            debugMsg(ex, key, value, "could not parse color description for '{}'='{}' returning null");
            return null;
        }
    }

    /**
     * parse the style and return the property value in Color type, or <code>defaultColor</code> for null.
     *
     * @param style        style to parse
     * @param key          property key
     * @param defaultColor alternative value for null
     * @return Color type property value
     */
    public static Color getColorPropertyValue(final String style, final String key, final Color defaultColor) {
        final Color result = getColorPropertyValue(style, key);
        return result != null ? result : defaultColor;
    }

    /**
     * parse the style and return property value as double[] type, array values are split with comma ',', such as
     * "floatingPointArray=0.1,0.2"
     *
     * @param style style to parse
     * @param key   property value
     * @return property in double[] type
     */
    public static double[] getFloatingDecimalArrayPropertyValue(final String style, final String key) {
        final String value = getPropertyValue(style, key);
        if (value == null) {
            return null;
        }

        try {
            final String[] splitValues = value.split(",");
            final double[] retArray = new double[splitValues.length];
            for (int i = 0; i < splitValues.length; i++) {
                retArray[i] = Double.parseDouble(splitValues[i]);
            }
            return retArray;
        } catch (final NumberFormatException ex) {
            debugMsg(ex, key, value, "could not parse floating point for '{}'='{}' returning null");
            return null;
        }
    }

    /**
     * Return double type property value
     *
     * @param style style to parse
     * @param key   property key
     * @return double property value
     */
    public static Double getFloatingDecimalPropertyValue(final String style, final String key) {
        final String value = getPropertyValue(style, key);
        if (value == null) {
            return null;
        }

        try {
            return Double.parseDouble(value);
        } catch (final NumberFormatException ex) {
            debugMsg(ex, key, value, "could not parse floating point for '{}'='{}' returning null");
            return null;
        }
    }

    /**
     * Return double type property value, or <code>defaultValue</code> for null
     *
     * @param style style to parse
     * @param key   property key
     * @return double property value
     */
    public static double getFloatingDecimalPropertyValue(String style, String key, double defaultValue) {
        Double value = getFloatingDecimalPropertyValue(style, key);
        if (value == null) {
            value = defaultValue;
        }
        return value;
    }


    /**
     * Return font in the style, or default font if parse failed
     *
     * @param style style to parse
     * @return Font
     */
    public static Font getFontPropertyValue(final String style) {
        if (style == null) {
            return Font.font(StyleParser.DEFAULT_FONT, StyleParser.DEFAULT_FONT_SIZE);
        }

        String fontName;
        final String fontN = StyleParser.getPropertyValue(style, XYChartCss.FONT);
        if (fontN != null && !fontN.isBlank())
            fontName = fontN;
        else
            fontName = StyleParser.DEFAULT_FONT;

        double fontSize = StyleParser.DEFAULT_FONT_SIZE;
        final Double fontSizeObj = StyleParser.getFloatingDecimalPropertyValue(style, XYChartCss.FONT_SIZE);
        if (fontSizeObj != null) {
            fontSize = fontSizeObj;
        }

        FontWeight fontWeight = null;
        final String fontW = StyleParser.getPropertyValue(style, XYChartCss.FONT_WEIGHT);
        if (fontW != null) {
            fontWeight = FontWeight.findByName(fontW);
        }

        FontPosture fontPosture = null;
        final String fontP = StyleParser.getPropertyValue(style, XYChartCss.FONT_POSTURE);
        if (fontP != null) {
            fontPosture = FontPosture.findByName(fontP);
        }

        return Font.font(fontName, fontWeight, fontPosture, fontSize);
    }

    /**
     * Return integer type property value
     *
     * @param style style to parse
     * @param key   int property key
     * @return integer property value
     */
    public static Integer getIntegerPropertyValue(final String style, final String key) {
        final String value = getPropertyValue(style, key);
        if (value == null) {
            return null;
        }

        try {
            return Integer.decode(value);
        } catch (final NumberFormatException ex) {
            debugMsg(ex, key, value, "could not parse integer for '{}'='{}' returning null");
            return null;
        }
    }

    /**
     * Return property value in double[] type
     *
     * @param style style to parse
     * @param key   property key
     * @return double[] as stroke dash array
     */
    public static double[] getStrokeDashPropertyValue(final String style, final String key) {
        final String value = getPropertyValue(style, key);
        if (value == null) {
            return null;
        }

        try {
            return Arrays.stream(value.split(",\\s*")).map(String::trim).mapToDouble(Double::parseDouble).toArray();
        } catch (final IllegalArgumentException ex) {
            debugMsg(ex, key, value, "could not parse color description for '{}'='{}' returning null");
            return null;
        }
    }

    /**
     * convert map containing property values into string
     *
     * @param map map with properties
     * @return CSS string
     */
    public static String mapToString(final Map<String, String> map) {
        String ret = "";
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            final String key = entry.getKey();
            final String value = entry.getValue();
            ret = ret.concat(key).concat("=").concat(value).concat(";");
        }
        return ret;
    }

    /**
     * spits input string, converts keys and values to lower case, and replaces '"'
     * and ''' if any
     *
     * @param style the input style string
     * @return the sanitised map
     */
    public static Map<String, String> splitIntoMap(final String style) {
        final Map<String, String> retVal = new HashMap<>();
        if (style == null) {
            return retVal;
        }

        // remove space
        final String[] keyVals = AT_LEAST_ONE_WHITESPACE_PATTERN.matcher(style.toLowerCase(Locale.UK)).replaceAll("").split(";");
        for (final String keyVal : keyVals) {
            final String[] parts = STYLE_ASSIGNMENT_PATTERN.split(keyVal, 2);
            if (parts.length <= 1) {
                continue;
            }

            retVal.put(parts[0], QUOTES_PATTERN.matcher(parts[1]).replaceAll(""));
        }

        return retVal;
    }

    private static void debugMsg(IllegalArgumentException ex, String key, String value, String couldNotParseColorDescription) {
        if (LOGGER.isTraceEnabled()) {
            LOGGER.atTrace().setCause(ex).addArgument(key).addArgument(value).log(couldNotParseColorDescription);
        }
        if (LOGGER.isErrorEnabled()) {
            LOGGER.atError().addArgument(key).addArgument(value).log(couldNotParseColorDescription);
        }
    }
}
