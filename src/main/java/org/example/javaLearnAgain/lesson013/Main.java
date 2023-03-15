package org.example.javaLearnAgain.lesson013;

import org.example.javaLearnAgain.lesson013.model.Animal;
import org.example.javaLearnAgain.lesson013.model.Cat;
import org.example.javaLearnAgain.lesson013.model.Cow;
import org.example.javaLearnAgain.lesson013.model.Dog;

public class Main {
    public static void main(String [] args){
        Animal cat1 = new Cat("white");
        Animal dog1 = new Dog("black");
        Animal cow1 = new Cow("red");
        //Animal unkn = new Animal() ;

        Animal [] animals = {cat1,dog1,cow1};

        for (Animal a:animals) {
            a.sound();

        }


    }
}
