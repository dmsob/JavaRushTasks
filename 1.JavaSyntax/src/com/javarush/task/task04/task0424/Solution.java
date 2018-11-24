package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] list = new int[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        list[0] = Integer.parseInt(reader.readLine());
        list[1] = Integer.parseInt(reader.readLine());
        list[2] = Integer.parseInt(reader.readLine());
        if (list[0] == list[1]){
            if (list[1] != list[2]) System.out.print(3);
        }
        else if (list[1] == list[2]) System.out.print(1);
            else if (list[0] == list[2])System.out.print(2);

    }
}
