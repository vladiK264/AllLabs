package org.example;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle("Красный", 1.0, 2.0, 5.0),
                new Circle("Зеленый", 0.0, 0.0, 3.5),
                new Circle("Синий", -2.0, 4.0, 10.0),
                new Rectangle("Желтый", 5.0, 5.0, 4.0, 6.0),
                new Rectangle("Черный", 10.0, 12.0, 2.5, 8.0)
        };

        System.out.println("=== РЕЗУЛЬТАТЫ ОБРАБОТКИ МАССИВА ФИГУР (ПОЛИМОРФИЗМ) ===\n");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("--- Фигура №" + (i + 1) + " ---");
            shapes[i].displayInfo();
            shapes[i].draw();
            System.out.println("Рассчитанная площадь: " + String.format("%.2f", shapes[i].calculateArea()));
            System.out.println();
        }
        Figura f;
    }
}
