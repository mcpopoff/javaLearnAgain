package org.example.javaLearnAgain.lesson013.model;

public class Dog extends Animal{
    private Dog(){
        System.out.println("I’m a dog");
    }

    public Dog(String color){
        System.out.println("I’m a " + color + " dog");
    }
    @Override
    public void sound(){
        System.out.println("woof");
    }
}
