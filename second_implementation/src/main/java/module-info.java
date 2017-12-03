import io.github.aplotnikov.java.modules.api.Processor;
import io.github.aplotnikov.java.modules.impl.two.SecondProcessor;

module java.modules.impl.two {
    requires java.modules.api;

    provides Processor with SecondProcessor;
}
