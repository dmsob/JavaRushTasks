package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        a = Integer.parseInt(reader.readLine());//3
        b = Integer.parseInt(reader.readLine());//2
        c = Integer.parseInt(reader.readLine());//1
        if (a<b) {
            if (b<c) System.out.println(b);
                else if (a<c) System.out.println(c);
                    else System.out.println(a);
        }
        else if (a<c) System.out.println(a);
        else if (c<b)System.out.println(b);
            else System.out.println(c);

    }
}
