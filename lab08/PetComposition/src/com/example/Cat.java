package com.example;

public class Cat extends Animal implements Pet {

    private Ambulatory ambulatory;
    private String name;
    
    public Cat() {
        this("Fluffy");
    }
    
    public Cat(String name) {
        super(4);
        this.ambulatory = new AmbulatoryImpl(4);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " likes to play with string.");
    }

    public void walk() {
        this.ambulatory.walk();
    }
}