package org.vasyldmitrovich.firstspring.musicplayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //Testing dependency injection
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
                musicPlayer.playMusic();
        System.out.println("This is name song: "+musicPlayer.getName());
        System.out.println("This is volume: "+musicPlayer.getVolume());

        //Show list songs
        MusicPlayer musicPlayerList = context.getBean("musicPlayList",MusicPlayer.class);
        musicPlayerList.playListMusics();

        context.close();
    }
}
