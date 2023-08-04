package io.fair_acc.sample.chart;

import io.fair_acc.chartfx.axes.spi.DefaultNumericAxis;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * @author Jiawei Mao
 * @version 0.0.1
 * @since 03 8月 2023, 10:19
 */
public class AxisDemo7 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        final VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        final DefaultNumericAxis xAxis9 = new DefaultNumericAxis("dynamic Axis", -1e-6 * 0, 0.001, 1);
        VBox.setMargin(xAxis9, new Insets(20, 10, 20, 10));
        xAxis9.setUnit("V");
        xAxis9.setAutoUnitScaling(true);
        xAxis9.setMinorTickCount(10);
        xAxis9.setAutoRangeRounding(true);
        root.getChildren().add(xAxis9);

        final Label xAxis9Text = new Label();
        root.getChildren().add(xAxis9Text);


        final Timer timer = new Timer("sample-update-timer", true);
        final TimerTask task = new TimerTask() {
            private int counter = -9;
            private boolean directionUpwards = true;

            @Override
            public void run() {

                if (directionUpwards) {
                    counter++;
                } else {
                    counter--;
                }
                Platform.runLater(() -> {
                    final double power = Math.pow(10, counter);
                    xAxis9.maxProperty().set(power);
                    final String text = "actual SI range for dynamic axis: ["
                            + xAxis9.getMin() + " V, "
                            + xAxis9.getMax() + " V]";
                    xAxis9Text.setText(text);
                });
                if ((counter >= 9) || (counter <= -9)) {
                    directionUpwards = !directionUpwards;
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, TimeUnit.SECONDS.toMillis(2));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
