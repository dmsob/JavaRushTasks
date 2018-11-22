package com.javarush.task.task04.task0402;

/* 
Цена яблок
*/
public class Solution {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.getApplesPrice());
    }

    public static class Apple {
        private static int applesPrice = 0;

        public static int getApplesPrice() {
            return applesPrice;
        }

        public static void setApplesPrice(int applesPrice) {
            Apple.applesPrice = applesPrice;
        }

        public static void addPrice(int applesPrice) {
            Apple.setApplesPrice(Apple.getApplesPrice() + applesPrice);
        }
    }
}
