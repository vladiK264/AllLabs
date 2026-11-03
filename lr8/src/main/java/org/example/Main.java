package org.example;

public class Main {
    public static void main(String[] args) {

        Software[] softwareList = new Software[5];


        softwareList[0] = new Game("The Witcher 3", "1.32", 1499.00, "RPG");
        softwareList[1] = new Game("Cyberpunk 2077", "2.1", 2499.00, "Action/RPG");
        softwareList[2] = new Game("Counter-Strike 2", "1.0", 0.00, "Shooter");
        softwareList[3] = new Editor("IntelliJ IDEA", "2023.3", 0.00, ".java");
        softwareList[4] = new Editor("Adobe Photoshop", "2024", 1999.00, ".psd");

        System.out.println("=== ДЕМОНСТРАЦИЯ РАБОТЫ ПРОГРАММНОГО ОБЕСПЕЧЕНИЯ ===\n");

        for (int i = 0; i < softwareList.length; i++) {
            System.out.println("--- Элемент #" + (i + 1) + " ---");
            softwareList[i].displayInfo();
            softwareList[i].install();

            if (softwareList[i] instanceof Game) {
                Game game = (Game) softwareList[i];
                game.launch();
            } else if (softwareList[i] instanceof Editor) {
                Editor editor = (Editor) softwareList[i];
                editor.saveFile();
            }

            System.out.println();
        }
        Software software = new Game("The Witcher 3", "1.32", 1499.00, "RPG");
        Game game = new Game("The Witcher 3", "1.32", 1499.00, "RPG");
    }
}