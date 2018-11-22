package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int first, second, third;
        first = number/100; //5
        second = number%10; //6
        third = number/10%10; //4
        final int s = first + second + third;
        return s;
    }
}