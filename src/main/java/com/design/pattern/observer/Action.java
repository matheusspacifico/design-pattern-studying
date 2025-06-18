package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Action {
    private final String name;
    private double price;
    private final List<Observer> observers;

    public Action(String name, double price) {
        this.name = name;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this.name, this.price));
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        System.out.println("Action " + this.name + " price changed to R$ " + this.price);
        notifyObservers();
    }
}
