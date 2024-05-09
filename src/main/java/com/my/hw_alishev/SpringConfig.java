package com.my.hw_alishev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@ComponentScan("com.my.hw_alishev")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() { return new ClassicalMusic(); }

    @Bean
    public ReggaeMusic reggaeMusic() {
        return new ReggaeMusic();
    }

    @Bean
    public TranceMusic tranceMusic() { return new TranceMusic(); }

    @Bean
    public List<Music> playlist() {
        List<Music> playlist = new ArrayList<>();
        playlist.add(reggaeMusic());
        playlist.add(classicalMusic());
        playlist.add(tranceMusic());
        return playlist;
    }

    @Bean
    public MusicPlayer musicPlayer() { return new MusicPlayer(playlist()); }

//    @Bean
//    public MusicPlayer musicPlayer() {
//        return new MusicPlayer(reggaeMusic(), classicalMusic());
//    }
}
