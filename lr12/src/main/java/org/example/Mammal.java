package org.example;

public class Mammal extends Animal {
    private String fur;

    public Mammal(String name, int id, String habitat, String fur) {
        super(name, id, habitat);
        this.fur = fur;
    }

    public String getFur() { return fur; }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + ", fur='" + fur + "'}";
    }
}
