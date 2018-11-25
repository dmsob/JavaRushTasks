package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a>b) {
            if (a>c) {System.out.print(a+" ");
                if (b>c) System.out.print(b+" "+c);
                    else System.out.print(c+" "+b);
            }
            else System.out.print(c+" "+a+" "+b);
        }
            else if(b>c) {
                System.out.print(b+" ");
                if (a>c) System.out.print(a+" "+c);
                    else System.out.print(c+" "+a);
            } else System.out.print(c+" "+b+" "+a);
    }
}
