package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void run() {
        System.out.println("\n--- ЗАДАНИЕ 3 ---");
        String fileF = "f_task3.txt";
        String fileG = "g_task3.txt";
        String fileH = "h_task3.txt";

        int totalNumbers = 20;
        Random random = new Random();

        // 1. Генерация случайных чисел в файл f
        try (PrintWriter pwF = new PrintWriter(new FileWriter(fileF))) {
            for (int i = 0; i < totalNumbers; i++) {
                pwF.println(random.nextInt(201) - 100); // от -100 до 100
            }
            System.out.println("Файл " + fileF + " успешно заполнен " + totalNumbers + " случайными числами.");
        } catch (IOException e) {
            System.err.println("Ошибка создания файла f: " + e.getMessage());
            return;
        }

        // 2. Разделение чисел по файлам g и h
        try (Scanner scannerF = new Scanner(new File(fileF));
             PrintWriter pwG = new PrintWriter(new FileWriter(fileG));
             PrintWriter pwH = new PrintWriter(new FileWriter(fileH))) {

            while (scannerF.hasNextInt()) {
                int num = scannerF.nextInt();
                if (num % 8 == 0 && num % 3 != 0) {
                    pwG.println(num);
                } else {
                    pwH.println(num);
                }
            }
            System.out.println("Данные успешно распределены:");
            System.out.println("- В " + fileG + ": кратные 8 и не кратные 3");
            System.out.println("- В " + fileH + ": все остальные");
        } catch (IOException e) {
            System.err.println("Ошибка обработки потоков: " + e.getMessage());
        }
    }
}