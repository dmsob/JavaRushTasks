package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t = reader.readLine();
        double a = Double.parseDouble(t);
        a %= 5;

        if (a < 3) {System.out.print("зелёный");}
            else if (a < 4) {System.out.print("жёлтый");}
                else if (a < 5) {System.out.print("красный");}
    }
}