package io.fair_acc.sample.chart;

import io.fair_acc.chartfx.axes.spi.DefaultNumericAxis;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Jiawei Mao
 * @version 0.0.1
 * @since 02 8月 2023, 15:28
 */
public class AxisDemo2 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        final DefaultNumericAxis xAxis = new DefaultNumericAxis("axis label", 0, 100, 1);
        VBox.setMargin(xAxis, new Insets(20, 10, 20, 10));
        xAxis.setUnit("m");

        VBox root = new VBox(xAxis);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
