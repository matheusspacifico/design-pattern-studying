package com.design.pattern.observer;

public class SmsObserver implements Observer {
    @Override
    public void update(String actionName, double newPrice) {
        String formattedPrice = String.format("%.2f", newPrice);
        System.out.println("[SMS] Alerta Urgente: Preço de " + actionName + " alterado para R$ " + formattedPrice);
    }
}
