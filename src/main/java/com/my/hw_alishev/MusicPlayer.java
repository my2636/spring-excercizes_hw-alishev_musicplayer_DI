package com.my.hw_alishev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//@Component
public class MusicPlayer {
////    @Autowired
////    @Qualifier("reggaeMusic")
//    private Music music1;
////    @Autowired
////    @Qualifier("classicalMusic")
//    private Music music2;
//    @Value("${musicPlayer.name}")
//    private String name;
//    @Value("${musicPlayer.volume}")
//    private int volume;

//    public MusicPlayer(Music music1, Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }
    private List<Music> playlist = new ArrayList<>();

    public MusicPlayer(List<Music> playlist) {
        this.playlist = playlist;
    }

    public void playAnySong() {
        Random random = new Random();
        int randomMusicArray = random.nextInt(playlist.size());
        Music music = playlist.get(randomMusicArray);
        System.out.println(music.getSong(random.nextInt(music.getAllSongs().length)));
    }


//    public String getName() {
//        return name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }

//    public void playVariousMusic(MusicType type) {
//        Random random = new Random();
//        switch (type) {
//            case REGGAE_MUSIIC: { System.out.println(music1.getSong(random.nextInt(music1.getAllSongs().length - 1)));
//            break;
//            }
//            case CLASSICAL_MUSIC: { System.out.println(music2.getSong(random.nextInt(music2.getAllSongs().length - 1)));
//            break;
//            }
//        }
//    }
}