package com.company;

public class Refrigerator extends BaseEntity {
    private int volume;

    public Refrigerator(String brand, String model, String color, double price, int volume) {
        super(brand, model, color, price);
        this.volume = volume;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Холодильник " + getBrand() + " - " + getPrice() + "грн.";
    }
    public void info(){
        System.out.println("Холодильник " + "\n" +
                "Производитель: " + getBrand() +"\n" +
                "Модель: " + getModel() + "\n" +
                "Объем: " + getVolume() + "л." + "\n" +
                "Цвет: " + getColor() + "\n" +
                "Цена: " + getPrice() + "грн." +  "\n" + "\n" +
                "Для добавления в корзину нажмите 9" + "\n" +
                "Для возврата в предыдущее меню нажмите 0");
    }
}

