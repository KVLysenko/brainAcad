package com.company;

public class Washer extends BaseEntity {
    private int maxLoad;
    private int spinSpeed;
    private int programm;

    public Washer(String brand, String model, String color, double price, int maxLoad, int spinSpeed, int programm) {
        super(brand, model, color, price);
        this.maxLoad = maxLoad;
        this.spinSpeed = spinSpeed;
        this.programm = programm;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public int getProgramm() {
        return programm;
    }

    public void setProgramm(int programm) {
        this.programm = programm;
    }

    @Override
    public String toString() {
        return "Стиральная машина " + getBrand() + " - " + getPrice() + "грн.";
    }


    public void info(){
        System.out.println("Стиральная машина " + "\n" +
                "Производитель: "+ getBrand()+"\n"+
                "Модель: " + getModel() + "\n" +
                "Цвет: " + getColor() + "\n" +
                "Макс. загрузка: " + getMaxLoad() + "кг." + "\n" +
                "Скорость отжима: " + getSpinSpeed() + " оборотов в минуту" + "\n" +
                "Колличество программ: " + getProgramm() + "\n" +
                "Цена: " + getPrice() + "грн."  + "\n" + "\n" +
                "Для возврата в предыдущее меню нажмите 0");
    }
}


