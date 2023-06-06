module dataset {

    requires org.slf4j;
    requires org.apache.commons.lang3;
    requires org.jetbrains.annotations;

    exports io.fair_acc.dataset;
    exports io.fair_acc.dataset.spi;
    exports io.fair_acc.dataset.utils;
    exports io.fair_acc.dataset.event;
    exports io.fair_acc.dataset.spi.utils;
    exports io.fair_acc.dataset.locks;
    exports io.fair_acc.dataset.testdata.spi;
    exports io.fair_acc.dataset.testdata;
    exports io.fair_acc.dataset.spi.fastutil;
    exports io.fair_acc.dataset.spi.financial;
    exports io.fair_acc.dataset.spi.financial.api.ohlcv;
    exports io.fair_acc.dataset.spi.financial.api.attrs;
}