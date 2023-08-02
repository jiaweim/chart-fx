package io.fair_acc.sample.chart;

import io.fair_acc.chartfx.axes.spi.DefaultNumericAxis;
import io.fair_acc.chartfx.axes.spi.MetricPrefix;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * @author Jiawei Mao
 * @version 0.0.1
 * @since 02 8月 2023, 15:49
 */
public class AxisDemo4 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        final VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        // to force unit scaling to '1000' 'k' suffix
        // N.B. tick unit is being overwritten by scaling
        final DefaultNumericAxis xAxis4 = new DefaultNumericAxis("very large current", 1e3, 100e3, 1e2);
        VBox.setMargin(xAxis4, new Insets(20, 10, 20, 10));
        xAxis4.setUnitScaling(500);
//        xAxis4.setUnitScaling(MetricPrefix.KILO);
        xAxis4.setUnit("A");
        xAxis4.getAxisLabel().setFont(Font.font("Times", 25));
        xAxis4.getAxisLabel().setFill(Color.RED.darker());
        root.getChildren().add(xAxis4);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
