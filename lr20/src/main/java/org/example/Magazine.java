package org.example;
import java.util.List;

public class Magazine {
    private int id;
    private String title;
    private String category;
    private int rating;
    private List<Integer> readerRatings;

    public Magazine(int id, String title, String category, int rating, List<Integer> readerRatings) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.rating = rating;
        this.readerRatings = readerRatings;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public List<Integer> getReaderRatings() { return readerRatings; }

    public double getAverageRating() {
        if (readerRatings == null || readerRatings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int score : readerRatings) {
            sum += score;
        }
        return (double) sum / readerRatings.size();
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Название: %-18s | Категория: %-12s | Рейтинг: %d | Ср. балл: %.2f",
                id, title, category, rating, getAverageRating());
    }
}
