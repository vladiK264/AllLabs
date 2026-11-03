package org.example;

class Hammer implements Useful, Repairable {
    private String name;
    private double weight;
    private boolean broken;



    public Hammer(String name, double weight, boolean broken) {
        this.name = name;
        this.weight = weight;
        this.broken = broken;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void use() {
        if (broken) {
            System.out.println("Молоток \"" + name + "\" сломан! Использовать нельзя.");
        } else {
            System.out.println("Забиваем гвозди молотком \"" + name + "\" (вес: " + weight + " кг).");
            if (Math.random() < 0.3) {
                broken = true;
                System.out.println("--> Ох! Молоток \"" + name + "\" сломался во время работы!");
            }
        }
    }

    @Override
    public String getPurpose() {
        return "Забивание гвоздей и демонтажные работы";
    }

    @Override
    public void repair() {
        if (broken) {
            broken = false;
            System.out.println("Молоток \"" + name + "\" успешно отремонтирован (заменена рукоятка).");
        } else {
            System.out.println("Молоток \"" + name + "\" не нуждается в ремонте.");
        }
    }

    @Override
    public boolean isBroken() {
        return broken;
    }
}