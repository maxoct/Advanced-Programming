package com.muhammad;

public class Main {

    public static void main(String[] args) {
        Animals[] animals = new Animals[4];

        animals[0] = new Birds();
        animals[1] = new Water();
        animals[2] = new Land();
        animals[3] = new Insects();


        for (int i = 0; i < animals.length; i++) {
            animals[i].callSound();

        }

        System.out.println("Output of Variadic Function starts here: \n");
        fun(animals[1]);  // variadic function calling
    }

    // variadic function starts from here

    static void fun(Animals... a) {
        for (Animals i : a) {
            i.callSound();
        }
    }

}