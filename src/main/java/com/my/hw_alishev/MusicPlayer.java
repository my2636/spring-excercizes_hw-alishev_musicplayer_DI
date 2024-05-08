package com.my.hw_alishev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("reggaeMusic")
    private Music music1;
    @Autowired
    @Qualifier("classicalMusic")
    private Music music2;

    public void playVariousMusic(MusicType type) {
        Random random = new Random();
        switch (type) {
            case REGGAE_MUSIIC: { System.out.println(music1.getSong(random.nextInt(music1.getAllSongs().length - 1)));
            break;
            }
            case CLASSICAL_MUSIC: { System.out.println(music2.getSong(random.nextInt(music2.getAllSongs().length - 1)));
            break;
            }
        }
    }
}