package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name = null;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name){ //7
        this.name = name;
        this.age = 3;
        this.weight = 3;
        this.color = "unknow";
    }
    public void initialize(String name,int age){ //9
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "black";
    }
    public void initialize(String name,int weight, int age){ //8
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "black";
    }

    public void initialize(int weight, String color){
        this.name = null;
        this.age = 3;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address){
        this.age = 3;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    public static void main(String[] args) {

    }
}
