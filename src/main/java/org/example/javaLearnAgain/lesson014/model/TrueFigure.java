package org.example.javaLearnAgain.lesson014.model;

public class TrueFigure {
    int length;
    protected String space = " ";
    protected String nextLine = "\n";

    protected TrueFigure(int length){
        this.length = length;
    }

    protected void drawFigure(String fig){
        System.out.println(fig);
    }

    public int getLength() {
        return length;
    }
}
