package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        int j = Integer.parseInt(reader.readLine());
        for (int m = 0; m < i; m++) {
            for (int k = 0; k < j; k++) {
                System.out.print(8);

            }
            System.out.println();
        }

    }
}
