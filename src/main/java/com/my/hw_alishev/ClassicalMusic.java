package com.my.hw_alishev;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    private String[] songs = {"FirstClassicalSong", "SecondClassicalSong", "ThirdClassicalSong"};

    @Override
    public String getSong(int i) {
        return songs[i];
    }

    public String[] getAllSongs() {
        return songs;
    }
}
