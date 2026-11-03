package org.example;

class Track {
    private String title;
    private String artist;
    private int duration;

    private static int totalTracks = 0;
    private static int totalDuration = 0;

    public Track(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;

        totalTracks++;
        totalDuration += duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    // Статические методы для работы с общими счетчиками
    public static int getTotalTracks() {
        return totalTracks;
    }

    public static int getTotalDuration() {
        return totalDuration;
    }

    public static double getAverageDuration() {
        if (totalTracks == 0) {
            return 0.0;
        }
        return (double) totalDuration / totalTracks;
    }

    public static void displayPrintInfo(Track track) {
        System.out.printf("Т: %s - %s (%d сек.)%n", track.artist, track.title, track.duration);
    }

    public void displayInfo() {
        System.out.printf("Трек: %s - %s (%d сек.)%n", artist, title, duration);
    }
}