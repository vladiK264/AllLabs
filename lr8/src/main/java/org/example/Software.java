package org.example;

public class Software {
    public String name;
    private String version;
    private double price;

    public Software(String name, String version, double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void install() {
        System.out.println("Установка стандартного программного обеспечения...");
    }

    public void displayInfo() {
        System.out.printf("ПО: %s | Версия: %s | Цена: %.2f руб.%n", name, version, price);
    }
}