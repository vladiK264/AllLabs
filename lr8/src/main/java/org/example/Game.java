package org.example;

public class Game extends Software {
    private String genre;

    public Game(String name, String version, double price, String genre) {
        super(name, version, price);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void install() {
        System.out.println("Установка игры (занимает много места)");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Жанр игры: " + genre);
    }

    public void launch() {
        System.out.println("Запуск игры " + getName() + "... Приятной игры!");
    }
}