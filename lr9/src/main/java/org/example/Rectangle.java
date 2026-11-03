package org.example;


class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double x, double y, double width, double height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Рисую прямоугольник " + width + "x" + height);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип: Прямоугольник | Ширина: " + width + ", Высота: " + height + " | Площадь: " + calculateArea());
    }
}


