package org.example;
public class Animal {
    private String name;
    private int id;
    private String habitat;

    public Animal(String name, int id, String habitat) {
        this.name = name;
        this.id = id;
        this.habitat = habitat;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public String getHabitat() { return habitat; }

    @Override
    public String toString() {
        return "id=" + id + ", habitat='" + habitat + "'";
    }
}