package org.example;

public class Main {
    public static void main(String[] args) {
        Repairable.printServiceNotice();
        System.out.println();

        Hammer h1 = new Hammer("Кровельный молоток", 0.8, false);
        Hammer h2 = new Hammer("Тяжелый кувалдочка", 2.5, true);
        Hammer h3 = new Hammer("Слесарный молоток", 0.5, false);

        Screwdriver s1 = new Screwdriver("Крестовая PH2", "PH2", false);
        Screwdriver s2 = new Screwdriver("Шлицевая SL5", "SL5", true);

        Useful[] tools = new Useful[] { h1, h2, h3, s1, s2 };

        System.out.println("=== 1. ПРОВЕРКА И ИСПОЛЬЗОВАНИЕ ИНСТРУМЕНТОВ ===");
        for (Useful tool : tools) {
            System.out.println("Назначение: " + tool.getPurpose());
            tool.use();
            System.out.println("----------------------------------------------");
        }

        System.out.println("\n=== 2. ТЕХНИЧЕСКОЕ ОБСЛУЖИВАНИЕ И РЕМОНТ ===");
        for (Useful tool : tools) {
            if (tool instanceof Repairable) {
                Repairable repairableTool = (Repairable) tool;
                if (repairableTool.isBroken()) {
                    System.out.println("Статус: Требуется ремонт.");
                    repairableTool.repair();
                } else {
                    System.out.println("Статус: Исправен.");
                }
            }
            System.out.println("----------------------------------------------");
        }

        System.out.println("\n=== 3. ПОВТОРНОЕ ИСПОЛЬЗОВАНИЕ ПОСЛЕ РЕМОНТА ===");
        for (Useful tool : tools) {
            tool.use();
        }
    }
}