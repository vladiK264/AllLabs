package org.example;

interface Useful {
    void use();
    String getPurpose();
}

interface Repairable {


    void repair();
    boolean isBroken();

    static void printServiceNotice() {
        System.out.println("[СЕРВИС]: Регулярно проверяйте исправность ваших инструментов!");
    }
}