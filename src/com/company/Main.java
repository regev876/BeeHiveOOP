package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bee nechama = new Bee();
        Bee moshe = new Bee();
        Bee nechama2;
        nechama2 = nechama;

        int number = 0;
        int number2 =0;
        number2 = number;
        number = 10;
        int age = 7;

        moshe.name = "Moshe";
        nechama.name = "Nechama";

        nechama2.getAge();
        nechama2.getAge();
        nechama.getAge();

        Bee.printMaxLife();

    }
}
