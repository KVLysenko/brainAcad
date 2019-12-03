package com.company;

import java.util.ArrayList;

public class ShopBasket {
    private ArrayList basket = new ArrayList();

    public void add (BaseEntity unit){
        this.basket.add(unit);
    }
    public void dell (int index){
        this.basket.remove(index);
    }

    public void allPurchases() {
        if (this.basket.size() == 0) {
            System.out.println("(пусто)");
            System.out.println("Для возврата в главное меню нажмите 0");
        } else {
            for (int i = 0; i < this.basket.size(); i++) {
                System.out.println((i + 1) + "." + this.basket.get(i));
            }
            System.out.println("Для удаления из корзины введите номер товара\nДля возврата в главное меню введите 0");
        }
    }

    @Override
    public String toString() {
        return "Ваша корзина:\n" +
                "basket =" + basket +
                '}';
    }
}
