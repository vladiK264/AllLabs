package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void run(Scanner scanner) {
        System.out.println("\n--- ЗАДАНИЕ 2 ---");
        String fileName = "f_task2.txt";

        // 1. Ввод 10 чисел с клавиатуры и сохранение в файл
        System.out.println("Введите 10 целых чисел:");
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Число [" + (i + 1) + "]: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Ошибка. Введите целое число: ");
                    scanner.next();
                }
                writer.println(scanner.nextInt());
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        // 2. Считывание, вывод и подсчёт
        int matchCount = 0;
        System.out.println("\nЧисла, прочитанные из файла:");
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextInt()) {
                int val = fileScanner.nextInt();
                System.out.print(val + " ");

                if (val % 6 == 0 && val % 9 != 0) {
                    matchCount++;
                }
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
            return;
        }

        System.out.println("Количество чисел, кратных 6 и не кратных 9: " + matchCount);
    }
}
