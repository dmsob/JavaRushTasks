package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[15];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <15 ; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        int a=0,b=0;
        for (int i = 0; i < 15; i++) {
            if ((i%2==0)||(i==0)) a=a+arr[i];
            else b=b+arr[i];
        }
        if (a>b) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
