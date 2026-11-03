package org.example;

class SUV extends Car {
    private boolean fourWheelDrive;

    public SUV(String brand, String engine, int horsepower, boolean fourWheelDrive) {
        super(brand, engine, horsepower);
        this.fourWheelDrive = fourWheelDrive;
    }
    public SUV(boolean fourWheelDrive ){
        super("мерс", " dfhas", 1234);
        this.fourWheelDrive = fourWheelDrive;
    }
    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    @Override
    public String getEfficiency() {
        return "Средняя эффективность (полный привод)";
    }

    public void start(double remoteSignal) {
        System.out.println(getBrand() + " [SUV]: Завожу через дистанционный сигнал " + remoteSignal + " ГГц");
    }
}
