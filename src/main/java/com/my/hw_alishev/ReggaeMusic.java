package com.my.hw_alishev;

import org.springframework.stereotype.Component;

@Component
public class ReggaeMusic implements Music{
    private String[] songs = {"FirstReggaeSong", "SecondReggaeSong", "ThirdReggaeSong"};

    @Override
    public String getSong(int i) {
        return songs[i];
    }
    @Override
    public String[] getAllSongs() {
        return songs;
    }
}
