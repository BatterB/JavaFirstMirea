package ru.mirea.task5;

import java.util.Scanner;

public class Lab5 {
    public static void shop(){
        FurnitureShop shop = new FurnitureShop();
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.println("1) Стул - добавить в корзину\n2) Стол - добавить в корзину\n3) Очистить корзину (стул)\n4) Очистить корзину (стол)\n5) Корзина\n6) Баланс\n7) Оплата\n8) Установить баланс\n9) Закончить покупки");
        while (true) {
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    shop.addToCart(1);
                    break;
                case 2:
                    shop.addToCart(2);
                    break;
                case 3:
                    shop.deleteFromCart(1);
                    break;
                case 4:
                    shop.deleteFromCart(2);
                    break;
                case 5:
                    shop.cart();
                    break;
                case 6:
                    shop.getBalance();
                    break;
                case 7:
                    shop.pay();
                    break;
                case 8:
                    System.out.println("Добавить денег: 1");
                    choice = in.nextInt();
                    shop.setMoney(choice);
                    break;
                case 9:
                    System.exit(0);
            }
        }
    }

    public static void dish(){
        Dish plate = new Plate("white", "small","square");
        System.out.println(plate);
        Dish cup = new Cup("blue", "big","coffee");
        System.out.println(cup);
    }

    public static void dogs(){
        Dog ovharka = new Ovcharka("white", "medium");
        System.out.println(ovharka);
        ovharka.Voice();
        Dog chau = new ChauChau("orange", "medium","a little burnt)");
        System.out.println(chau);
        chau.Voice();
    }
    public static void main(String[] args) {
        dish();
        dogs();
        shop();
    }
}
