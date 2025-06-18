package com.design.pattern.facade.electronics;

public class Television {

    public void turnOn() {
        System.out.println("TV turned on!");
    }

    public void turnOff() {
        System.out.println("TV turned off!");
    }

    public void setInputSource(String source) {
        System.out.println("TV input source changed to: " + source);
    }
}
