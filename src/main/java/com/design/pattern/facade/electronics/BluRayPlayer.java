package com.design.pattern.facade.electronics;

public class BluRayPlayer {

    public void turnOn() {
        System.out.println("BluRay Player turned on!");
    }

    public void turnOff() {
        System.out.println("BluRay Player turned off!");
    }

    public void playMovie(String movie) {
        System.out.println("Now playing " + movie + "...");
    }

    public void stopMovie() {
        System.out.println("Movie stopped!");
    }

    public void ejectDisk() {
        System.out.println("Disk ejected!");
    }
}
