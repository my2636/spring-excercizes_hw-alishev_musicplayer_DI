package com.my.hw_alishev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml.example");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
//        player.playVariousMusic(MusicType.REGGAE_MUSIIC);
//        System.out.println(player.getName() + " " + player.getVolume());
//
//        Music reggaeMusicBean1 = context.getBean("reggaeMusic", ReggaeMusic.class);

        player.playAnySong();

        context.close();
    }
}