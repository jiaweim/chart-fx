module math {
    exports io.fair_acc.math.spectra.wavelet;
    exports io.fair_acc.math;
    exports io.fair_acc.math.spectra;
    exports io.fair_acc.math.functions;
    exports io.fair_acc.math.matrix;
    exports io.fair_acc.math.spectra.dtft;
    exports io.fair_acc.math.spectra.lomb;
    exports io.fair_acc.math.filter;
    exports io.fair_acc.math.filter.fir;
    exports io.fair_acc.math.fitter;
    exports io.fair_acc.math.filter.iir;

    requires dataset;
    requires org.jetbrains.annotations;
    requires commons.math3;
    requires org.slf4j;
    requires JTransforms;

}