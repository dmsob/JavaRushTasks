package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] sarr = new String[10];
        int[] narr = new int[10];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            sarr[i] = reader.readLine();
            narr[i] = sarr[i].length();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(narr[i]);
        }

    }
}
