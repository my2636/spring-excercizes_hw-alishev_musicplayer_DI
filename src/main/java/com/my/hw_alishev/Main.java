package com.my.hw_alishev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playVariousMusic(MusicType.REGGAE_MUSIIC);
        System.out.println(player.getName() + " " + player.getVolume());

        Music reggaeMusicBean1 = context.getBean("reggaeMusic", ReggaeMusic.class);

        context.close();
    }
}