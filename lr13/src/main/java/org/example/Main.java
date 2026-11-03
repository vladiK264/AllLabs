package org.example;
import java.util.HashMap;
import java.util.Map;



public class Main {
    public static void main(String[] args) {
        System.out.println("=== Лабораторная работа № 13. Вариант 25 ===");

        Pharmacy pharmacy = null;

        try {
            pharmacy = new Pharmacy("Планета Здоровья", "ул. Советская, 12", 0, 4.7);
            System.out.println("Аптека успешно открыта!");
        } catch (InvalidPharmacyDataException e) {
            System.out.println("Ошибка при создании аптеки: " + e.getMessage());
        }


        if (pharmacy == null) {
            return;
        }

        try {
            pharmacy.restockMedicine("Аспирин", 50);
            pharmacy.restockMedicine("Парацетамол", 20);
        } catch (InvalidPharmacyDataException e) {
            System.out.println("Ошибка пополнения: " + e.getMessage());
        }

        pharmacy.printInfo();

        try {
            System.out.println("\nПопытка 1: Продаем 10 шт. Аспирина");
            pharmacy.sellMedicine("Аспирин", 10);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            System.out.println("\nПопытка 2: Продаем 30 шт. Парацетамола (а есть только 20)");
            pharmacy.sellMedicine("Парацетамол", 30);
        } catch (StockException e) {
            System.out.println("Перехвачено StockException: " + e.getMessage());
        } catch (MedicineNotFoundException | InvalidPharmacyDataException e) {
            System.out.println("Другая ошибка: " + e.getMessage());
        } finally {
            System.out.println("Блок finally: операция завершена.");
        }

        try {
            System.out.println("\nПопытка 3: Продаем Ибупрофен (его нет в наличии)");
            pharmacy.sellMedicine("Ибупрофен", 5);
        } catch (MedicineNotFoundException e) {
            System.out.println("Перехвачено MedicineNotFoundException: " + e.getMessage());
        } catch (StockException | InvalidPharmacyDataException e) {
            System.out.println("Другая ошибка: " + e.getMessage());
        }

        try {
            System.out.println("\nПопытка 4: Продаем отрицательное количество");
            pharmacy.sellMedicine("Аспирин", -5);
        } catch (InvalidPharmacyDataException e) {
            System.err.println("Перехвачено InvalidPharmacyDataException: " + e.getMessage());
        } catch (MedicineNotFoundException | StockException e) {
            System.out.println("Другая ошибка: " + e.getMessage());
        }

        try {
            System.out.println("\nПопытка 5: Создание аптеки с отрицательным количеством лекарств (-10)");
            new Pharmacy("Неверная Аптека", "ул. Ленина, 1", -10, 4.0);
        } catch (InvalidPharmacyDataException e) {
            System.out.println("Конструктор выбросил исключение: " + e.getMessage());
        }

        System.out.println("\nИтоговое состояние:");
        pharmacy.printInfo();
    }
}