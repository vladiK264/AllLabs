package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void removeLowRatedMagazines(List<Magazine> magazines) {
//        Iterator<Magazine> iterator = magazines.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().getAverageRating() < 3.0) {
//                iterator.remove();
//            }
//        }

    }

    public static void promoteHighRatedMagazines(List<Magazine> magazines) {
        Iterator<Magazine> iterator = magazines.iterator();
        while (iterator.hasNext()) {
            Magazine mag = iterator.next();
            if (mag.getAverageRating() >= 4.0) {
                mag.setRating(mag.getRating() + 1);
            }
        }
    }

    public static void printMagazines(List<Magazine> magazines, int rating) {
        System.out.println("\n--- Журналы с рейтингом " + rating + " ---");
        boolean found = false;
        Iterator<Magazine> iterator = magazines.iterator();
        while (iterator.hasNext()) {
            Magazine mag = iterator.next();
            if (mag.getRating() == rating) {
                System.out.println(mag);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Журналы не найдены.");
        }
    }

    public static void sortAndDisplay(List<Magazine> magazines) {
        magazines.sort(Comparator.comparingDouble(Magazine::getAverageRating)
                .thenComparing(Magazine::getTitle).reversed());

        System.out.println("\n=== СПИСОК ЖУРНАЛОВ (Отсортирован) ===");
        Iterator<Magazine> iterator = magazines.iterator();
        while (iterator.hasNext()) {
            Magazine mag = iterator.next();
            System.out.printf("ID: %-3d | Название: %-20s | Ср. балл: %.2f%n",
                    mag.getId(), mag.getTitle(), mag.getAverageRating());
        }
    }

    static void main() {
        List<Magazine> magazines = new ArrayList<>();

        magazines.add(new Magazine(1, "National Geographic", "Наука", 4, List.of(5, 5, 4, 5)));
        magazines.add(new Magazine(2, "Forbes", "Бизнес", 3, List.of(4, 4, 3, 4)));
        magazines.add(new Magazine(3, "Yellow Press", "Слухи", 2, List.of(2, 1, 3, 2)));
        magazines.add(new Magazine(4, "Tech Monthly", "IT", 4, List.of(5, 4, 5, 5)));
        magazines.add(new Magazine(5, "Cheap News", "Новости", 1, List.of(1, 2, 2, 1)));
        magazines.add(new Magazine(6, "Vogue", "Мода", 3, List.of(4, 5, 4, 3)));

        System.out.println("=== ИСХОДНЫЙ СПИСОК ЖУРНАЛОВ ===");
        Iterator<Magazine> it1 = magazines.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        removeLowRatedMagazines(magazines);
        System.out.println("\n=== ПОСЛЕ УДАЛЕНИЯ ЖУРНАЛОВ СО СРЕДНИМ БАЛЛОМ < 3 ===");
        Iterator<Magazine> it2 = magazines.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        promoteHighRatedMagazines(magazines);
        System.out.println("\n=== ПОСЛЕ ПОВЫШЕНИЯ РЕЙТИНГА ДЛЯ ЖУРНАЛОВ СО СРЕДНИМ БАЛЛОМ >= 4 ===");
        Iterator<Magazine> it3 = magazines.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }

        printMagazines(magazines, 5);

        sortAndDisplay(magazines);
    }
}