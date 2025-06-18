package com.design.pattern.facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        String movie = "O Senhor dos Anéis: A Sociedade do Mal";
        String tvSource = "HDMI1";
        int volume = 70;

        System.out.println("### Preparando para assistir ao filme... ###");
        homeTheater.watchMovie(movie, tvSource, volume);

        System.out.println("### Desligando tudo... ###");
        homeTheater.stopMovie();
    }
}
