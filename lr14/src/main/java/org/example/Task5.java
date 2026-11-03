package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void run() {
        System.out.println("\n--- ЗАДАНИЕ 5 ---");
        String fileName = "f_task5.txt";
        Random random = new Random();

        // 1. Генерация 10 чисел в файл f
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 10; i++) {
                writer.println(random.nextInt(101)); // от 0 до 100
            }
            System.out.println("Файл " + fileName + " с 10 числами успешно создан.");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        // 2. Чтение и подсчёт элементов < 40
        int count = 0;
        System.out.println("\nСчитанные числа:");
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextInt()) {
                int val = fileScanner.nextInt();
                System.out.print(val + " ");
                if (val < 40) {
                    count++;
                }
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
            return;
        }

        System.out.println("Количество чисел, меньших 40: " + count);
    }
}