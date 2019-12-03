package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в интернет - магазин: Интер - техника." + "\n" +
                "Для выбора товара введите соответствующую цифру." + "\n");

        Scanner scanner = new Scanner(System.in);
        int userAnsw;
        int menu = -1;
        int itemNum = -1;
        ShopBasket basket = new ShopBasket();


        BaseEntity[][] menuArr = new BaseEntity[3][4];
        menuArr[0][0] = new Refrigerator("LG", "kg458ay", "Металлик",  5406.15, 117);
        menuArr[0][1] = new Refrigerator("Samsung", "sp6eqw3", "Чёрный", 10_256.50, 201);
        menuArr[0][2] = new Refrigerator("Nord", "259r", "Белый", 3599.25, 100);
        menuArr[0][3] = new Refrigerator("Whirpool", "B67g61W", "Металлик", 14_170.00, 356);
        menuArr[1][0] = new Washer("Whirpool", "45iryt", "Белый", 12_351.25, 6, 1000, 12);
        menuArr[1][1] = new Washer("Zanussi", "NWyu675", "Silver", 10_550.00, 6, 1000, 8);
        menuArr[1][2] = new Washer("LG", "98rutw", "Белый", 15_781.85, 7, 1200, 14);
        menuArr[1][3] = new Washer("Samsung", "Sam87", "Белый", 9_351.25, 5, 1200, 10);
        menuArr[2][0] = new Microwave("Samsung", "374dfft", "Чёрный", 2399.00, 23, 800);
        menuArr[2][1] = new Microwave("LG", "689dsa", "Металлик", 1599.00, 20, 600);
        menuArr[2][2] = new Microwave("Beko", "eddf688", "Металлик", 3399.00, 27, 1000);
        menuArr[2][3] = new Microwave("Whirpool", "374dfft", "Белый", 3799.00, 30, 1200);

        while(true){
            if (menu < 0 ){
                menu = selectMenu();
                if (menu == -1){
                    break;
                }else if (menu == 8){
                    basket(basket);
                    menu = -1;
                    continue;
                }
            }

            if (itemNum < 0){
                for (int i = 0; i < menuArr[menu].length; i++) {
                    System.out.println(i + 1 + ". " + menuArr[menu][i]);
                }
                System.out.println("\n" + "Для возврата в предыдущее меню нажмите 0");
                itemNum = selectItem();
                if (itemNum == -1){
                    menu = -1;
                    continue;
                }
                menuArr[menu][itemNum].info();
            }

            userAnsw = scanner.nextInt();
            if (userAnsw == 0){
                itemNum = -1;
            }else if (userAnsw == 9){
                basket.add(menuArr[menu][itemNum]);
                itemNum = -1;
                System.out.println("Добавлено");
            }
        }

    }

    public static int selectMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Каталог товаров: " +
                "\n1" + ". Холодильники;" +
                "\n2" + ". Стиральные машины;" +
                "\n3" + ". Микроволновые печи.");
        System.out.println("Для просмотра корзины нажмите 9\nДля выхода нажмите 0");
        int userAns = scanner.nextInt();
        if (userAns == 0) {
            return -1;
        } else {
            return userAns -1;
        }
    }

    public static int selectItem() {
        Scanner scanner = new Scanner(System.in);
        int userAns = scanner.nextInt();
        if (userAns == 0){
            return -1;
        }else{
            return userAns - 1;
        }
    }

    public static void basket(ShopBasket basket){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("В вашей корзине:");
            basket.allPurchases();
            int dellNum = scanner.nextInt();
            if (dellNum == 0){
                break;
            }else {
                basket.dell(dellNum-1);
            }
        }
    }
}

