package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Создание 6 музыкальных треков ===");

        Track track1 = new Track("Numb", "Linkin Park", 187);
        Track track2 = new Track("Bohemian Rhapsody", "Queen", 354);
        Track track3 = new Track("Shape of You", "Ed Sheeran", 233);
        Track track4 = new Track("Smells Like Teen Spirit", "Nirvana", 301);
        Track track5 = new Track("Blinding Lights", "The Weeknd", 200);
        Track track6 = new Track("Billie Jean", "Michael Jackson", 294);


        Track.displayPrintInfo(track1);


        System.out.println("\n=== Общая статистика ===");

        System.out.println("Всего треков создано: " + Track.getTotalTracks());
        System.out.println("Общая длительность всех треков: " + Track.getTotalDuration() + " сек.");
        System.out.printf("Средняя длительность трека: %.2f сек.%n", Track.getAverageDuration());
    }

}
