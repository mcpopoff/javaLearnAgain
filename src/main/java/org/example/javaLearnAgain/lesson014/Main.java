package org.example.javaLearnAgain.lesson014;

import org.example.javaLearnAgain.lesson014.model.Square;
import org.example.javaLearnAgain.lesson014.model.Triangle;
import org.example.javaLearnAgain.lesson014.model.TrueFigure;

public class Main {
    public static void main(String[]args){
        Square sq = new Square(4);
        sq.drawFigure();

        Triangle tr = new Triangle(4);
        tr.drawFigure();

    }
}
