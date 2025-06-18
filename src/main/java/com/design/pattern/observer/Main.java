package com.design.pattern.observer;

public class Main {
    public static void main(String[] args) {
        Action petrobas = new Action("PETR4", 28.00);

        Observer email = new EmailObserver();
        Observer app = new AppObserver();
        Observer sms = new SmsObserver();

        petrobas.addObserver(email);
        petrobas.addObserver(app);
        petrobas.addObserver(sms);

        System.out.println("--- Primeira mudança de preço ---");
        petrobas.setPrice(28.50);

        System.out.println("\n--- Removendo observador de email e mudando o preço novamente ---");
        petrobas.removeObserver(email);
        petrobas.setPrice(27.90);
    }
}
