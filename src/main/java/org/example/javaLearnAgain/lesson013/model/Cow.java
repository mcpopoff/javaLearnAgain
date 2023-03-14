package org.example.javaLearnAgain.lesson013.model;

public class Cow extends Animal{
    private Cow(){
        System.out.println("I’m a cat");
    }

    public Cow(String color){
        System.out.println("I’m a " + color + " cow");
    }

    public void moo(){
        super.sound("moo");
    }
}
