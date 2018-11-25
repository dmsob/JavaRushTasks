package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s =0;
        int[] n = new int[3];
        n[0] = Integer.parseInt(reader.readLine());
        n[1] = Integer.parseInt(reader.readLine());
        n[2] = Integer.parseInt(reader.readLine());
        for (int i = 0; i <3 ; i++) {
            if (n[i]>0) s++;
        }
        System.out.print(s);
    }
}
