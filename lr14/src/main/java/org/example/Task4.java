package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void run(Scanner scanner) {
        System.out.println("\n--- ЗАДАНИЕ 4 ---");
        String fileName = "battery_data.txt";

        // 1. Ввод 10 значений с клавиатуры и запись в файл
        System.out.println("Введите 10 значений заряда батареи (в %):");
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Значение [" + (i + 1) + "]: ");
                while (!scanner.hasNextDouble()) {
                    System.out.print("Ошибка. Введите число: ");
                    scanner.next();
                }
                double val = scanner.nextDouble();
                // Записываем всегда в едином формате с точкой
                writer.println(String.format(Locale.US, "%.2f", val));
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        // 2. Чтение из файла через BufferedReader и безопасный парсинг
        double sum = 0.0;
        int count = 0;

        System.out.println("\nСчитанные значения:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                // Заменяем запятую на точку, если она вдруг попала в файл
                double val = Double.parseDouble(line.replace(',', '.'));
                System.out.printf(Locale.US, "%.2f%% ", val);
                sum += val;
                count++;
            }
            System.out.println();
        } catch (IOException | NumberFormatException e) {
            System.err.println("Ошибка при чтении или парсинге файла: " + e.getMessage());
            return;
        }

        if (count > 0) {
            double avg = sum / count;
            System.out.printf(Locale.US, "Средний уровень заряда: %.2f%%\n", avg);
        }
    }
}
