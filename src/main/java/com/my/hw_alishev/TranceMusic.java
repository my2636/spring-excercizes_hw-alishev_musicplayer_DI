package com.my.hw_alishev;

public class TranceMusic implements Music {
    private String[] songs = {"Туц-туц", "Тыц-тыц", "Пщщщщ"};

    @Override
    public String getSong(int i) { return songs[i]; }

    @Override
    public String[] getAllSongs() {
        return songs;
    }
}
