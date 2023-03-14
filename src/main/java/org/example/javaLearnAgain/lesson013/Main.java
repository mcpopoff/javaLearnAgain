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
        Animal unkn = new Animal();

        Animal [] animals = {cat1,dog1,cow1, unkn};

        for (Animal a:animals) {
            if (Cat.class.equals(a.getClass())) {
                ((Cat) a).meow();
            } else if (Dog.class.equals(a.getClass())) {
                ((Dog) a).woof();
            } else if (Cow.class.equals(a.getClass())) {
                ((Cow) a).moo();
            } else {
                System.out.println("...");
            }
        }


    }
}
