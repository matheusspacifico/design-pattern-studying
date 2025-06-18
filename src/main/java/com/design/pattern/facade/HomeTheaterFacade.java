package com.design.pattern.facade;

import com.design.pattern.facade.electronics.BluRayPlayer;
import com.design.pattern.facade.electronics.SoundSystem;
import com.design.pattern.facade.electronics.Television;

public class HomeTheaterFacade {
    private final Television tv;
    private final SoundSystem audio;
    private final BluRayPlayer player;

    public HomeTheaterFacade() {
        this.tv = new Television();
        this.audio = new SoundSystem();
        this.player = new BluRayPlayer();
    }

    public void watchMovie(String movie, String tvSource, int volume) {
        tv.turnOn();
        tv.setInputSource(tvSource);

        audio.turnOn();
        audio.enableSurround();
        audio.setVolume(volume);

        player.turnOn();
        player.playMovie(movie);
    }

    public void stopMovie() {
        player.stopMovie();
        player.ejectDisk();
        player.turnOff();

        audio.turnOff();

        tv.turnOff();
    }
}
