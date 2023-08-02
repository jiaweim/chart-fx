package io.fair_acc.sample.chart;

import io.fair_acc.chartfx.axes.spi.DefaultNumericAxis;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author Jiawei Mao
 * @version 0.0.1
 * @since 02 8月 2023, 15:46
 */
public class AxisDemo3 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        final VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        final DefaultNumericAxis xAxis3 = new DefaultNumericAxis("current", 0, 100, 1);
        VBox.setMargin(xAxis3, new Insets(20, 10, 20, 10));
        xAxis3.setUnit("A");
        xAxis3.getAxisLabel().setFill(Color.RED.darker());

        root.getChildren().add(xAxis3);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
