package com.example;

public class Spider extends Animal {
    private Ambulatory ambulatory;
    public Spider() {
        super(8);
        this.ambulatory = new AmbulatoryImpl(8);
    }

    @Override
    public void eat() {
        System.out.println("The spider eats a fly.");
    }

    public void walk() {
        this.ambulatory.walk();
    }
}