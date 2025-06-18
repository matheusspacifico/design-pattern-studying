package com.design.pattern.observer;

public class AppObserver implements Observer {
    @Override
    public void update(String actionName, double newPrice) {
        String precoFormatado = String.format("%.2f", newPrice);
        System.out.println("[APP] Alerta de Preço: Ação " + actionName + " está agora custando R$ " + precoFormatado);
    }
}
