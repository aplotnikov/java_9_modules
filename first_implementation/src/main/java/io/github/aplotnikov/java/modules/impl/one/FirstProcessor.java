package io.github.aplotnikov.java.modules.impl.one;

import io.github.aplotnikov.java.modules.api.Processor;

public class FirstProcessor implements Processor {
    @Override
    public void process() {
        System.out.println("First processor does something");
    }
}
