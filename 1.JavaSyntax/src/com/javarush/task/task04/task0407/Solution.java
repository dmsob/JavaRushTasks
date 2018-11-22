package com.javarush.task.task04.task0407;

/* 
Кошки во Вселенной
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.addNewCat();

        Cat cat2 = new Cat();
        cat2.addNewCat();

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;

        public static void addNewCat() {
            count++;
        }
    }
}