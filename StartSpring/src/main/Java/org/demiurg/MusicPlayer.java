package org.demiurg;
/*
  Здесь применим инверсию управления IoC
 */
public class MusicPlayer {
    private Music music;
    /*
    Конструктор
     */
    public MusicPlayer(Music music){
        this.music = music;
    }
    public void playMusic(){
        System.out.println(music.toSong());
    }
}
