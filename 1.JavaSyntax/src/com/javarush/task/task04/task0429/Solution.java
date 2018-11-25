package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a =0;
        int b =0;
        int[] n = new int[3];
        n[0] = Integer.parseInt(reader.readLine());
        n[1] = Integer.parseInt(reader.readLine());
        n[2] = Integer.parseInt(reader.readLine());
        for (int i = 0; i <3 ; i++) {
            if (n[i]>0) a++;
            else if (n[i]<0) b++;
        }
        System.out.println("количество отрицательных чисел: "+b);
        System.out.print("количество положительных чисел: "+a);
     }
}
