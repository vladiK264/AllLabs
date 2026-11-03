package org.example;

import java.util.Scanner;
public class Main {

public static void main(String[] args) {
    System.out.println("Введите один из трех классов (Пример 1/2/3)");
    Scanner scanner = new Scanner(System.in);
    int WClass = scanner.nextInt();
    switch (WClass){
        case 1:{
            Game game1 = new Game("The Witcher 3", "RPG", 10);
            Game game2 = new Game("Casual Runner", "Arcade", 6);

            System.out.println("Игра: " + game1.getTitle() + " (Рейтинг: " + game1.getRating() + ")");
            if (game1.isTop()) {
                System.out.println("Статус: Это топовая игра!");
            } else {
                System.out.println("Статус: Обычная игра.");
            }


            System.out.println(game1);

            System.out.println("\nИгра: " + game2.getTitle() + " (Рейтинг: " + game2.getRating() + ")");
            if (game2.isTop()) {
                System.out.println("Статус: Это топовая игра!");
            } else {
                System.out.println("Статус: Обычная игра.");
            }
            break;
        }

        case 2: {
            Lake[] lakes = new Lake[] {
                    new Lake("Байкал", 1642.0, 31722.0),
                    new Lake("Виктория", 80.0, 68800.0),
                    new Lake("Верхнее", 406.0, 82100.0),
                    new Lake("Танганьика", 1470.0, 32900.0),
                    new Lake("Ладожское", 230.0, 17700.0)
            };

            Lake deepestLake = lakes[0];
            Lake largestAreaLake = lakes[0];

            for (int i = 1; i < lakes.length; i++) {
                if (lakes[i].getDepth() > deepestLake.getDepth()) {
                    deepestLake = lakes[i];
                }
                if (lakes[i].getArea() > largestAreaLake.getArea()) {
                    largestAreaLake = lakes[i];
                }
            }

            System.out.println("--- Результаты поиска ---");
            System.out.println("Самое глубокое озеро: " + deepestLake);
            System.out.println("Озеро с максимальной площадью: " + largestAreaLake);
            break;
        }
        case 3:{
            Trip[] trips = new Trip[] {
                    new Trip("Минск", Transport.TRAIN),
                    new Trip("Париж", Transport.PLANE),
                    new Trip("Брест", Transport.BUS),
                    new Trip("Гродно", Transport.TRAIN),
                    new Trip("Санкт-Петербург", Transport.SHIP),
                    new Trip("Гомель", Transport.CAR)
            };

            System.out.println("--- Список всех поездок на поезде (TRAIN) ---");
            for (Trip trip : trips) {
                if (trip.getTransport() == Transport.TRAIN) {
                    System.out.println(trip);
                }
            }
            break;
        }





    }}
}
