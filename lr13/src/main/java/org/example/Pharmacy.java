package org.example;
import java.util.HashMap;
import java.util.Map;

class Pharmacy {
    private String name;
    private String address;
    private int medicines;
    private Map<String, Integer> stock = new HashMap<>();
    private double rating;

    public Pharmacy(String name, String address, int medicines, double rating) throws InvalidPharmacyDataException {
        setAddress(address);
        setMedicines(medicines);
        setName(name);
        setRating(rating);
    }

    public void setName(String name) throws InvalidPharmacyDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidPharmacyDataException("Название аптеки не может быть пустым");
        }
        this.name = name;
    }

    public void setAddress(String address) throws InvalidPharmacyDataException {
        if (address == null || address.isEmpty()) {
            throw new InvalidPharmacyDataException("Адрес аптеки не может быть пустым");
        }
        this.address = address;
    }

    public void setMedicines(int medicines) throws InvalidPharmacyDataException {
        if (medicines < 0) {
            throw new InvalidPharmacyDataException("Количество лекарств не может быть отрицательным: " + medicines);
        }
        this.medicines = medicines;
    }

    public void setStock(Map<String, Integer> stock) {
        this.stock = new HashMap<>();
    }

    public void setRating(double rating) throws InvalidPharmacyDataException {
        if (rating < 1 || rating > 5) {
            throw new InvalidPharmacyDataException("Рейтинг должен быть от 1 до 5");
        }
        this.rating = rating;
    }

    public void restockMedicine(String name, int quantity) throws InvalidPharmacyDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidPharmacyDataException("Название лекарства не может быть пустым");
        }
        if (quantity <= 0) {
            throw new InvalidPharmacyDataException("Количество для пополнения должно быть больше 0");
        }

        if (stock.containsKey(name)) {
            int current = stock.get(name);
            stock.put(name, current + quantity);
        } else {
            stock.put(name, quantity);
        }

        medicines += quantity;
        System.out.println("Пополнили склад: " + name + " (+" + quantity + " шт.). Сейчас: " + stock.get(name) + " шт.");
    }

    public void sellMedicine(String name, int quantity) throws InvalidPharmacyDataException, MedicineNotFoundException, StockException {
        if (name == null || name.isEmpty()) {
            throw new InvalidPharmacyDataException("Название лекарства не может быть пустым");
        }
        if (quantity <= 0) {
            throw new InvalidPharmacyDataException("Количество для продажи должно быть больше 0");
        }

        if (!stock.containsKey(name)) {
            throw new MedicineNotFoundException("Лекарство '" + name + "' не найдено в аптеке");
        }

        int available = stock.get(name);
        if (available < quantity) {
            throw new StockException("Недостаточно товара на складе! Запрошено: " + quantity + ", в наличии: " + available);
        }

        stock.put(name, available - quantity);
        medicines -= quantity;
        System.out.println("Продано: " + name + " (" + quantity + " шт.). Остаток: " + stock.get(name) + " шт.");
    }

    public void printInfo() {
        System.out.println("------------------------------------");
        System.out.println("Аптека: " + name);
        System.out.println("Адрес: " + address);
        System.out.println("Рейтинг: " + rating);
        System.out.println("Всего единиц товара: " + medicines);
        System.out.println("Товары на складе: " + stock);
        System.out.println("------------------------------------");
    }
}
