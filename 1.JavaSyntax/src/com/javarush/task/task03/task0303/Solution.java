package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(1, 1.5));
        System.out.println(convertEurToUsd(1, 1.3));
    }

    public static double convertEurToUsd(int eur, double course) {
        double v = eur * course;
        return v;
    }
}
