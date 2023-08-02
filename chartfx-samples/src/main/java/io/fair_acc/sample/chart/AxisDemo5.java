package io.fair_acc.sample.chart;

import io.fair_acc.chartfx.axes.spi.DefaultNumericAxis;
import io.fair_acc.chartfx.axes.spi.MetricPrefix;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Jiawei Mao
 * @version 0.0.1
 * @since 02 8月 2023, 16:05
 */
public class AxisDemo5 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        final VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        // to force unit scaling to '1e-3' '\mu' suffix
        final DefaultNumericAxis xAxis5 = new DefaultNumericAxis("small voltage", 0, 10e-6, 1e-6);
        VBox.setMargin(xAxis5, new Insets(20, 10, 20, 10));
        xAxis5.setUnitScaling(MetricPrefix.MICRO);
        xAxis5.setUnit("V");
        root.getChildren().add(xAxis5);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
