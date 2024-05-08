package com.my.hw_alishev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ReggaeMusic implements Music{
    private String[] songs = {"FirstReggaeSong", "SecondReggaeSong", "ThirdReggaeSong"};

    @PostConstruct
    public void doInit() {
        System.out.println("Hi there! I'm initializing now! (reggaeBean)");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("I'm leaving this world.. (reggaeBean)");
    }

    @Override
    public String getSong(int i) {
        return songs[i];
    }
    @Override
    public String[] getAllSongs() {
        return songs;
    }
}
