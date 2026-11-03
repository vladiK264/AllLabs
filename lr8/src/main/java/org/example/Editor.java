package org.example;

public class Editor extends Software {
    private String fileFormat;

    public Editor(String name, String version, double price, String fileFormat) {
        super(name, version, price);
        this.fileFormat = fileFormat;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    @Override
    public void install() {
        System.out.println("Установка редактора");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Основной формат файлов: " + fileFormat);
    }

    public void saveFile() {
        System.out.println("Файл успешно сохранен в формате " + fileFormat + "!");
    }
}