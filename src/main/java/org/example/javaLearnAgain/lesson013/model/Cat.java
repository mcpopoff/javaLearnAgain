package org.example.javaLearnAgain.lesson013.model;

public class Cat extends Animal{
    private Cat(){
        System.out.println("I’m a cat");
    }

    public Cat(String color){
        System.out.println("I’m a " + color + " cat");
    }
    @Override
    public void sound(){
        System.out.println("meow");
    }
}
