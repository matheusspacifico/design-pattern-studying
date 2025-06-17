package com.design.pattern.singleton;

import java.util.Objects;

public class SingletonSpeedrun1 {
    private static SingletonSpeedrun1 instance;

    private SingletonSpeedrun1() {}

    public static SingletonSpeedrun1 getInstance() {
        synchronized (SingletonSpeedrun1.class) {
            if (Objects.isNull(instance)) {
                instance = new SingletonSpeedrun1();
            }
        }

        return instance;
    }

    // TIMER 54s
}
