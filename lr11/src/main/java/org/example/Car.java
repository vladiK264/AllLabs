package org.example;

class Car {
    private String brand;
    private String engine;
    private int horsepower;

    public Car(String brand, String engine, int horsepower) {
        this.brand = brand;
        this.engine = engine;
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public String getEngine() {
        return engine;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void start() {
        System.out.println(brand + ": Завожу авто с кнопки.");
    }

    public void start(int keyCode) {
        System.out.println(brand + ": Завожу кодом " + keyCode);
    }

    public void start(String mode) {
        System.out.println(brand + ": Завожу в режиме " + mode);
    }

    public String getEfficiency() {
        return "Средняя эффективность";
    }
}
