package io.fair_acc.sample.chart;

import io.fair_acc.chartfx.XYChart;
import io.fair_acc.chartfx.axes.spi.DefaultNumericAxis;
import io.fair_acc.dataset.spi.DoubleDataSet;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Simple example of how to use chart class
 *
 * @author rstein
 */
public class LineChartSample extends ChartSample {

    private static final int N_SAMPLES = 100; // default number of data points

    @Override
    public Node getChartPanel(final Stage primaryStage) {

        final DefaultNumericAxis yAxis = new DefaultNumericAxis();
        yAxis.setAutoRanging(true); // default: true
        yAxis.setAutoRangePadding(0.5); // here: 50% padding on top and bottom of axis

        final XYChart chart = new XYChart(new DefaultNumericAxis(), yAxis);

        final DoubleDataSet dataSet1 = new DoubleDataSet("data set #1");
        chart.getDatasets().addAll(dataSet1); // for two data sets

        final double[] xValues = new double[N_SAMPLES];
        final double[] yValues1 = new double[N_SAMPLES];
        for (int n = 0; n < N_SAMPLES; n++) {
            xValues[n] = n;
            yValues1[n] = Math.cos(Math.toRadians(10.0 * n));
        }
        dataSet1.set(xValues, yValues1);

        return new StackPane(chart);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        Application.launch(args);
    }
}
