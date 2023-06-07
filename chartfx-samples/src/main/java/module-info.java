module samples {

    requires javafx.controls;
    requires javafx.media;
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
    uses fxsampler.FXSamplerProject;


    exports io.fair_acc.sample.chart to fxsampler;
    exports io.fair_acc.sample.dataset to fxsampler;
    exports io.fair_acc.sample.financial to fxsampler;
    exports io.fair_acc.sample.math to fxsampler;
    exports io.fair_acc.sample.misc to fxsampler;


    provides fxsampler.FXSamplerProject with io.fair_acc.sample.ChartFxSamplerProject;
//            io.fair_acc.sample.ChartFxMathSamplerProject,
//            io.fair_acc.sample.ChartFxFinancialSamplerProject,
//            io.fair_acc.sample.ChartFxMiscSamplerProject;

    opens io.fair_acc.sample;
    opens io.fair_acc.sample.chart;
}