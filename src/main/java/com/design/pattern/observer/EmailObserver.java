package com.design.pattern.observer;

public class EmailObserver implements Observer {
    @Override
    public void update(String actionName, double newPrice) {
        String formattedPrice = String.format("%.2f", newPrice);
        System.out.println("[E-MAIL] Notificação: O preço da ação " + actionName + " mudou para R$ " + formattedPrice);
    }
}
