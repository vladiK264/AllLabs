package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Устанавливаем US-локаль, чтобы вещественные числа вводились через точку
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            System.out.println("\n=================================");
            System.out.println("1 - Задание 1 (Свойства файла и транспорт)");
            System.out.println("2 - Задание 2 (10 чисел с консоли, кратные 6 и не 9)");
            System.out.println("3 - Задание 3 (Случайные числа, разделение f -> g, h)");
            System.out.println("4 - Задание 4 (Заряд батареи, среднее значение)");
            System.out.println("5 - Задание 5 (10 чисел в f, количество < 40)");
            System.out.println("0 - Выход");
            System.out.println("\n=================================");
            System.out.print("Выберите действие: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Неверный ввод. Введите число от 0 до 5.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Task1.run();
                    break;
                case 2:
                    Task2.run(scanner);
                    break;
                case 3:
                    Task3.run();
                    break;
                case 4:
                    Task4.run(scanner);
                    break;
                case 5:
                    Task5.run();
                    break;
                case 0:
                    System.out.println("Завершение работы программы.");
                    return;
                default:
                    System.out.println("Пункт меню не найден. Попробуйте снова.");
            }
        }
    }
}