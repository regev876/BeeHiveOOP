package com.company;

public class Bee {
    private int age = 0;
    String name;
    public static int maxLife = 10;


    public int getAge(){
        this.add1Year();
        return age;
    }

    private void add1Year(){
        ++age;
    }

    public static void printMaxLife(){
        System.out.println(maxLife);
    }

}
