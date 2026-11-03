package org.example;

class Phone {
    private String brand;
    private String model;
    private double price;
    private int count;

    public int getCount(){
        return count;
    }
    public void setCount(int count){
        if(count >= 0){
            this.count = count;
        }
        else{
            System.out.println("Не верно введенные данные");
        }
    }
    public Phone(String brand, String model, double price, int count){
        this(brand,model,price);
        this.count = count;
    }

















    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Ошибка: Цена не может быть отрицательной.");
        }
    }


    public void applyDiscount(double discount) {
        if (discount > 0 && discount <= 100) {
            this.price -= this.price * (discount / 100.0);
        } else {
            System.out.println("Ошибка: Некорректный процент скидки.");
        }
    }

    public void displayInfo() {
        System.out.printf("Телефон: %s %s | Текущая цена: %.2f руб.%n", brand, model, price);
    }


    public String toString(){
        return brand + model + price;
    }
}



