package org.demiurg;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 03.05.2020  Spring   Xml конфигурация
 *
 */

public class TestSpring {
    public static void main(String[] args) {
        /*
         Создаем обьект context и подгружаем файл applicationContext.xml который содержит бины для создания обьектов
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*
        получаем бин с id musicBean и класса Music.class
         */
        // Music music = context.getBean("musicBean",Music.class);
        // MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer musicPlayer = context.getBean("playList",MusicPlayer.class);
        /*
        Создаем обьект класса MusicPlayer и кладем ему в конструктор обьект полученный с помощью getBean
         */
        // MusicPlayer musicPlayer = new MusicPlayer(music);
        /*
        Запускаем метод playMusic из класса MusicPlayer
         */
        //musicPlayer.playMusic();
        musicPlayer.playMusicList();
        /*
        выводим внедрённые значения из класса MusicPlayer
         */
        System.out.println(musicPlayer.getNameSong());
        System.out.println(musicPlayer.getVolume());

        /*
        Закрывваем сеанс
         */
        context.close();
    }
}
