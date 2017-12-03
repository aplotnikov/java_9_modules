package io.github.aplotnikov.java.modules.impl.two;

import io.github.aplotnikov.java.modules.api.Processor;

public class SecondProcessor implements Processor {
    @Override
    public void process() {
        System.out.println("Second processor does something");
    }
}
