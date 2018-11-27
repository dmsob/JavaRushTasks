package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName); //дедушка Вася

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName); //бабушка Мурка

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null,catGrandFather); // папа Котофей, без мамы, отец - дедушка Вася

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catGrandMother,null); // мама Василиса, мама - бабушка Мурка, без отца

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);

        System.out.println(catFather);
        System.out.println(catMother);

        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMom;
        private Cat parentDad;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentMom, Cat parentDad) {
            this.name = name;
            this.parentMom = parentMom;
            this.parentDad = parentDad;
        }



        @Override
        public String toString() {
            if ((parentMom == null)&&(parentDad == null))
                return "The cat's name is " + name + ", no mother, no father";
            else if (parentMom == null)
                return "The cat's name is " + name + ", no mother" + ", father is " + parentDad.name;
            else if (parentDad == null) return "The cat's name is " + name + ", mother is " + parentMom.name + ", no father";
            else return "The cat's name is " + name + ", mother is " + parentMom.name + ", father is " + parentDad.name;
        }
    }

}
