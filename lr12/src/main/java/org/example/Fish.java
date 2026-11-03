package org.example;

public class Fish extends Animal {
    private int fins;

    public Fish(String name, int id, String habitat, int fins) {
        super(name, id, habitat);
        this.fins = fins;
    }

    public int getFins() { return fins; }

    @Override
    public String toString() {
        return "Fish{" + super.toString() + ", fins=" + fins + "}";
    }
}