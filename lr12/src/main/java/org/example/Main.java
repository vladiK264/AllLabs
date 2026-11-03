package org.example;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Map<String, Animal> zoo = new LinkedHashMap<>();


        zoo.put("Лев", new Mammal("Лев", 101, "Саванна", "Густая грива"));
        zoo.put("Медведь", new Mammal("Медведь", 102, "Тайга", "Густой подшерсток"));
        zoo.put("Волк", new Mammal("Волк", 103, "Лес", "Жесткая шерсть"));

        zoo.put("Крокодил", new Reptile("Крокодил", 201, "Реки", "Роговые щитки"));
        zoo.put("Игуана", new Reptile("Игуана", 202, "Джунгли", "Мелкая чешуя"));
        zoo.put("Кобра", new Reptile("Кобра", 203, "Пустыня", "Гладкая чешуя"));

        zoo.put("Акула", new Fish("Акула", 301, "Океан", 8));
        zoo.put("Сом", new Fish("Сом", 302, "Пресноводный водоем", 7));

        System.out.println("=== СОДЕРЖИМОЕ ZOO MAP ===");
        Iterator<Map.Entry<String, Animal>> mapIterator = zoo.entrySet().iterator();
        while(mapIterator.hasNext()) {
            Map.Entry<String, Animal> entry = mapIterator.next();
            System.out.println("Ключ (Name): " + entry.getKey() + " | Значение: " + entry.getValue());
        }
    }
}
