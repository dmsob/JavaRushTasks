package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int iNum = Integer.parseInt(n);
        if (iNum>0) System.out.println(iNum*2);
           else if (iNum ==0) System.out.println(iNum);
           else System.out.println(iNum+1);
    }

}