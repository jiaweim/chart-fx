package io.fair_acc.sample.chart;

import io.fair_acc.chartfx.XYChart;
import io.fair_acc.chartfx.axes.spi.DefaultNumericAxis;
import io.fair_acc.chartfx.plugins.Zoomer;
import io.fair_acc.chartfx.renderer.LineStyle;
import io.fair_acc.chartfx.renderer.spi.ErrorDataSetRenderer;
import io.fair_acc.chartfx.renderer.spi.MassSpectrumRenderer;
import io.fair_acc.dataset.testdata.spi.GaussFunction;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Simple example of how to use chart class
 *
 * @author rstein
 */
public class ScatterChartSample extends ChartSample {

    private static final int N_SAMPLES = 100; // default number of data points

    @Override
    public Node getChartPanel(final Stage primaryStage) {

        final DefaultNumericAxis yAxis = new DefaultNumericAxis();
        yAxis.setMin(0);
        yAxis.setAutoRanging(true); // default: true
        yAxis.setAutoRangePadding(0.5); // here: 50% padding on top and bottom of axis

        final XYChart chart = new XYChart(new DefaultNumericAxis(), yAxis);

        GaussFunction function = new GaussFunction("gauss", 100);
//        final DoubleDataSet dataSet1 = new DoubleDataSet("data set #1");
//        chart.getDatasets().addAll(dataSet1); // for two data sets
        chart.getDatasets().addAll(function); // for two data sets

        MassSpectrumRenderer renderer = new MassSpectrumRenderer();
//        renderer.setDashSize(0);
//        renderer.setBarWidth(4);
        renderer.setDrawBars(true);
        renderer.setDrawMarker(false);
        renderer.setPolyLineStyle(LineStyle.NONE);
        renderer.setDrawBubbles(false);
//        renderer.setPolyLineStyle(LineStyle.HISTOGRAM_FILLED);
//        renderer.setPolyLineStyle(LineStyle.AREA);
//        chart.getRenderers().setAll(renderer);
//        chart.setHorizontalGridLinesVisible(false);
//        chart.setVerticalGridLinesVisible(false);
        chart.getPlugins().add(new Zoomer());
        chart.getRenderers().setAll(renderer);

//        final double[] xValues = new double[N_SAMPLES];
//        final double[] yValues1 = new double[N_SAMPLES];
//        for (int n = 0; n < N_SAMPLES; n++) {
//            xValues[n] = n;
//            yValues1[n] = Math.cos(Math.toRadians(10.0 * n));
//        }
//        dataSet1.set(xValues, yValues1);

        return new StackPane(chart);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        Application.launch(args);
    }
}
