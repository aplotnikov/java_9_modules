import io.github.aplotnikov.java.modules.api.Processor;
import io.github.aplotnikov.java.modules.impl.one.FirstProcessor;

module java.modules.impl.one {
    requires java.modules.api;

    provides Processor with FirstProcessor;
}