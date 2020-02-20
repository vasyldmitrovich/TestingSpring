package org.vasyldmitrovich.firstspring.musicplayer;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;
    //IoC

    public MusicPlayer(){}

    public MusicPlayer(Music music){
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setMusicList(ArrayList<Music> musicList){
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(){
        System.out.println("Play: "+music.getSong());
    }

    public void playListMusics(){
        for (Music m: musicList
             ) {
            System.out.println(m.getSong());
        }
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + music +
                ", musicList=" + musicList +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
