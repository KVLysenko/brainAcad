package com.company;

public class Microwave extends BaseEntity {
    private int volume;
    private int power;

    public Microwave(String brand, String model, String color, double price, int volume, int power) {
        super(brand, model, color, price);
        this.volume = volume;
        this.power = power;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Микроволновка " + getBrand() + " - " + getPrice() + "грн.";
    }
    public void info(){
        System.out.println("Микроволновка " + "\n" +
                "Производитель: " + getBrand() + "\n" +
                "Модель: " + getModel() + "\n" +
                "Цвет: "+ getColor() + "\n" +
                "Объем: "+ getVolume() + "л." + "\n" +
                "Можность: "+ getPower() + "Вт" + "\n" +
                "Цена: "+ getPrice() + "грн." + "\n" + "\n" +
                "Для добавления в корзину нажмите 9" + "\n" +
                "Для возврата в предыдущее меню нажмите 0");
    }
}

