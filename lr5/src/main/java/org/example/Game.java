package org.example;

 class Game {
    private String title;
    private String genre;
    private int rating;

    public Game(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public boolean isTop() {
        return this.rating >= 9;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public String getGenre() {
         return genre;
     }
     public String toString() {
         return title + "Name" + genre + " Genre " + rating + "Rating";
     }
 }



