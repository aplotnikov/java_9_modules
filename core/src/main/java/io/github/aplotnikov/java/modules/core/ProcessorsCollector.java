package io.github.aplotnikov.java.modules.core;

import io.github.aplotnikov.java.modules.api.Processor;

import java.util.ServiceLoader;

public class ProcessorsCollector {
    public void process() {
        ServiceLoader.load(Processor.class).forEach(Processor::process);
    }

    public static void main(String[] args) {
        new ProcessorsCollector().process();
    }
}
