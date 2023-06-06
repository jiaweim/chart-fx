module samples {

    requires javafx.controls;
    requires org.slf4j;
    requires chartfx;
    requires dataset;
    requires org.kordamp.ikonli.javafx;
    requires JTransforms;
    requires math;
    requires javafx.fxml;
    requires java.desktop;
    requires jafama;
    requires commons.math3;
    requires org.apache.commons.lang3;
    requires org.jetbrains.annotations;
    requires acc;
    requires fxsampler;

    opens io.fair_acc.sample.chart to javafx.graphics;
}