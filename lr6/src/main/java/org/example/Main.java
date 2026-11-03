package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Phone myPhone = new Phone("Apple", "iPhone 16 Pro Max", 3500.00);

            System.out.println("=== Исходная информация о телефоне ===");
            myPhone.displayInfo();
            System.out.println(myPhone);

            double discountPercent = 15.0;
            System.out.printf("%nПрименение скидки %.0f%%...%n", discountPercent);
            myPhone.applyDiscount(discountPercent);

            System.out.println("%n=== Информация после применения скидки ===");
            myPhone.displayInfo();
            System.out.printf("Новая цена через геттер: %.2f руб.%n", myPhone.getPrice());
        }

}
