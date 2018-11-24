package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        s = reader.readLine();
        int b = Integer.parseInt(s);
        s = reader.readLine();
        int c = Integer.parseInt(s);
        if (a >= b+c) { System.out.print("Треугольник не существует.");}
            else if (b >= a+c) { System.out.print("Треугольник не существует.");}
                else if (c >= a+b) { System.out.print("Треугольник не существует.");}
                else System.out.print("Треугольник существует.");

    }
}