package org.example;

class Screwdriver implements Useful, Repairable {
    private String name;
    private String size;
    private boolean broken;

    public Screwdriver(String name, String size, boolean broken) {
        this.name = name;
        this.size = size;
        this.broken = broken;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void use() {
        if (broken) {
            System.out.println("Отвертка \"" + name + "\" сломана! Использовать нельзя.");
        } else {
            System.out.println("Крутим винты отверткой \"" + name + "\" (размер шлица: " + size + ").");
            if (Math.random() < 0.3) {
                broken = true;
                System.out.println("--> Ох! У отвертки \"" + name + "\" сорвался шлиц!");
            }
        }
    }

    @Override
    public String getPurpose() {
        return "Закручивание и откручивание резьбовых крепежных изделий";
    }

    @Override
    public void repair() {
        if (broken) {
            broken = false;
            System.out.println("Отвертка \"" + name + "\" отремонтирована (заменен наконечник).");
        } else {
            System.out.println("Отвертка \"" + name + "\" полностью исправна.");
        }
    }

    @Override
    public boolean isBroken() {
        return broken;
    }
}