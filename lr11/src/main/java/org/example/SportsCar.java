package org.example;

class SportsCar extends Car {
    private double topSpeed;

    public SportsCar(String brand, String engine, int horsepower, double topSpeed) {
        super(brand, engine, horsepower);
        this.topSpeed = topSpeed;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    @Override
    public String getEfficiency() {
        return "Низкая эффективность (высокий расход топлива)";
    }

    public void start(int keyCode, String mode) {
        System.out.println(getBrand() + " [SportsCar]: Завожу с кодом " + keyCode + " в спортивном режиме " + mode);
    }
}
