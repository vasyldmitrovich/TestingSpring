package org.vasyldmitrovich.firstspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Music music = context.getBean("testMusic",Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();
    }
}
