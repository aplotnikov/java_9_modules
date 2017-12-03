package io.github.aplotnikov.java.modules.utils;

import io.vavr.control.Try;

public class MyUtils {
    public void doesSomething() {
        Try.run(() -> System.out.println("My utility class does something"));
    }
}
