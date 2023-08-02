package io.fair_acc.sample.chart;

import io.fair_acc.chartfx.axes.spi.DefaultNumericAxis;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Jiawei Mao
 * @version 0.0.1
 * @since 02 8月 2023, 16:10
 */
public class AxisDemo6 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        final VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        // example for scaling with non metric prefix and w/o unit
        final DefaultNumericAxis xAxis8 = new DefaultNumericAxis("non-metric scaling voltage variable w/o unit", 0,
                25e-6, 1e-6);
        VBox.setMargin(xAxis8, new Insets(20, 10, 20, 10));
        xAxis8.setUnitScaling(2.5e-6);
        // or alternatively:
        // xAxis7.setUnit(null);
        root.getChildren().add(xAxis8);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
