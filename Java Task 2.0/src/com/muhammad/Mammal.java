package com.muhammad;

public abstract class Mammal extends Animals {

    abstract void nature();

    void callSound() {
        System.out.println("Hi, I'm mammals\n");
        nature();
    }


}
