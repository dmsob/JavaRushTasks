package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, sum=0;
        while (true) {
            a = Integer.parseInt(reader.readLine());
            if (a == -1) {
                System.out.println(sum-1);
                break;
            }
            sum = sum + a;
        }
}}
