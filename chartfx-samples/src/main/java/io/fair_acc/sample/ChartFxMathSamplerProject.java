package io.fair_acc.sample;

import fxsampler.FXSamplerProject;
import fxsampler.model.WelcomePage;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ChartFxMathSamplerProject implements FXSamplerProject {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getProjectName() {

        return "ChartFx - Math";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSampleBasePackage() {

        return "io.fair_acc.sample.math";
    }

    ///** {@inheritDoc} */
    //@Override
    //public String getModuleName() {
    //    return "io.fair-acc";
    //}

    /**
     * {@inheritDoc}
     */
    @Override
    public WelcomePage getWelcomePage() {

        VBox vBox = new VBox();
        ImageView imgView = new ImageView();
        // imgView.setStyle("-fx-image: url('org/controlsfx/samples/ControlsFX.png');");
        StackPane pane = new StackPane();
        pane.setPrefHeight(207);
        //pane.setStyle("-fx-background-image: url('org/controlsfx/samples/bar.png');"
        //        + "-fx-background-repeat: repeat-x;");
        pane.getChildren().add(imgView);
        Label label = new Label();
        label.setWrapText(true);
        label.setText("Weilcome to ChartFx!\nThis library provides a wide array of facilities for high performance scientiific plotting.\n\n Explore the available chart controls by clicking on the options to the left.");
        label.setStyle("-fx-font-size: 1.5em; -fx-padding: 20 0 0 5;");
        vBox.getChildren().addAll(pane, label);
        return new WelcomePage("Welcome to ChartFx!", vBox);
    }
}