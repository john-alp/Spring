package org.demiurg;

import java.util.ArrayList;
import java.util.List;

/*
  Здесь применим инверсию управления IoC (Inversion control)

 */
public class MusicPlayer {
    private Music music;
    /*

     */
    private String nameSong;
    private int volume;
    List<Music> musicList;// = new ArrayList<>();
    /*
    Конструктор пустой для работы геттера
     */
    public MusicPlayer(){}
    /*
    Конструктор для первого примера
     */
    public MusicPlayer(Music music){
        this.music = music;
    }
    /*
    Создаем геттер для второго примера
     */
    public void setMusic (Music music){
        this.music = music;
    }
    public String getNameSong(){
        return this.nameSong;
    }
    public void setNameSong(String nameSong){
        this.nameSong = nameSong;
    }
    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList){
        this.musicList = musicList;
    }

    /*
    Проигрываем музыку, которая пришла через конструктор
     */
    public void playMusic(){
        System.out.println(music.getSong());
    }
     public void playMusicList(){
         for (Music music : musicList){
             System.out.println(music.getSong());
         }

     }

}

// это из applicationContext способ иньекции через конструктор

//<bean id="musicPlayer"
//class="org.demiurg.MusicPlayer">  <!-- dependency injection  DI с помощью конструктора -->
//<constructor-arg ref="superBean"/>  <!-- Здесь передаем данные в конструктор класса.
//        Даём ссылку на бин music bean, который создаст класс RockMusic -->
//</bean>
