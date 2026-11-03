package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. ДЕМОНСТРАЦИЯ СТАТИЧЕСКОГО ПОЛИМОРФИЗМА (ПЕРЕГРУЗКА МЕТОДОВ) ===\n");

        Car baseCar = new Car("Toyota", "V6", 249);
        SportsCar sportsCar = new SportsCar("Porsche", "Twin-Turbo Flat-6", 650, 330.0);
        SUV suv = new SUV("Volvo", "D5 Turbo", 235, true);

        baseCar.start();
        baseCar.start(4821);
        baseCar.start("Эко");

        sportsCar.start(9911, "Track");
        suv.start(2.4);

        System.out.println("\n=== 2. ДЕМОНСТРАЦИЯ ДИНАМИЧЕСКОГО ПОЛИМОРФИЗМА (ПЕРЕОПРЕДЕЛЕНИЕ) ===");

        Car[] fleet = new Car[] {
                new Car("Volkswagen", "1.6 MPI", 110),
                new SportsCar("Ferrari", "V8", 720, 340.0),
                new SUV("BMW X5", "3.0d", 400, true)
        };

        for (int i = 0; i < fleet.length; i++) {
            System.out.println("\n--- Автомобиль #" + (i + 1) + ": " + fleet[i].getBrand() + " ---");
            System.out.println("Мощность: " + fleet[i].getHorsepower() + " л.с.");

            System.out.println("Эффективность: " + fleet[i].getEfficiency());
            fleet[i].start();
        }

        System.out.println("\n=== 3. СРАВНЕНИЕ ТИПОВ И БЕЗОПАСНОЕ НИСХОДЯЩЕЕ ПРИВЕДЕНИЕ (instanceof) ===");

        for (Car car : fleet) {
            if (car instanceof SportsCar) {
                SportsCar sc = (SportsCar) car;
                System.out.println("Найден спорткар: " + sc.getBrand() + " с макс. скоростью " + sc.getTopSpeed() + " км/ч");
            } else if (car instanceof SUV) {
                SUV s = (SUV) car;
                System.out.println("Найден внедорожник: " + s.getBrand() + " (Полный привод: " + s.isFourWheelDrive() + ")");
            } else {
                System.out.println("Обычный автомобиль: " + car.getBrand());
            }
        }
    }
}
