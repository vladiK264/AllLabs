package org.example;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Task1 {
    public static void run() {
        System.out.println("\n--- ЗАДАНИЕ 1 ---");
        String fileName = "transport_info.txt";
        String content = "Любимый вид транспорта: Автомобиль (универсал Volvo V60).\n"
                + "Преимущества: безопасность, комфорт на дальних дистанциях, вместительность багажника.";

        File file = new File(fileName);

        // 1. Запись в файл
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            System.out.println("Файл успешно создан и заполнен.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
            return;
        }

        // 2. Метаданные файла
        System.out.println("\nСвойства файла:");
        System.out.println("- Имя: " + file.getName());
        System.out.println("- Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("- Размер: " + file.length() + " байт");
        System.out.println("- Чтение: " + (file.canRead() ? "доступно" : "запрещено"));
        System.out.println("- Запись: " + (file.canWrite() ? "доступна" : "запрещена"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("- Последняя модификация: " + sdf.format(file.lastModified()));

        // 3. Чтение файла
        System.out.println("\nСодержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
