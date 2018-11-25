package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i=0;
        double s=0.0;
        while (true){
            int a=Integer.parseInt(reader.readLine());
             if (a==-1) {if (i!=0) System.out.println(s/i); break;}
             else {s=s+a; i++;}

        }
    }
}

