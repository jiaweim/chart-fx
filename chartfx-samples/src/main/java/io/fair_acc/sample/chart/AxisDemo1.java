package io.fair_acc.sample.chart;

import io.fair_acc.chartfx.axes.spi.DefaultNumericAxis;
import io.fair_acc.chartfx.axes.spi.MetricPrefix;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Jiawei Mao
 * @version 0.0.1
 * @since 02 8月 2023, 15:17
 */
public class AxisDemo1 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        final DefaultNumericAxis xAxis = new DefaultNumericAxis("standard axis label w/o unit", 0, 100, 1);

        VBox.setMargin(xAxis, new Insets(20, 10, 20, 10));

        VBox root = new VBox(xAxis);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
