package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sa = reader.readLine();
        int a = Integer.parseInt(sa);
        String sb = reader.readLine();
        int b = Integer.parseInt(sb);

        if ((a>0)&&(b>0)) {System.out.println(1);}//для первой четверти a>0 и b>0;
            else if ((a<0)&&(b>0)) System.out.println(2); //для второй четверти a<0 и b>0;
            else if ((a<0)&&(b<0)) System.out.println(3); // для третьей четверти a<0 и b<0;
            else System.out.println(4); //для четвертой четверти a>0 и b<0.
    }
}
