package com.design.pattern.facade.electronics;

public class SoundSystem {

    public void turnOn() {
        System.out.println("Sound System turned on!");
    }

    public void turnOff() {
        System.out.println("Sound System turned off!");
    }

    public void setVolume(int level) {
        System.out.println("Volume level set to: " + level);
    }

    public void enableSurround() {
        System.out.println("Surround mode enabled!");
    }
}
