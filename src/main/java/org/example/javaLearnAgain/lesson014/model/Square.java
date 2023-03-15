package org.example.javaLearnAgain.lesson014.model;

public class Square extends TrueFigure{
    private String horizontalLine = "---";
    private String verticalLine = "|";

    public Square(int length) {
        super(length);
    }

    public void drawFigure(){
        String fig = "";
        String h = space;
        String v = verticalLine;
        for (int i = 0; i < getLength(); i++){
            h += horizontalLine;
            v += space + space + space;
        }
        h += space + nextLine;
        v += verticalLine + nextLine;
        fig += h;
        for (int i = 0; i < getLength(); i++){
            fig += v;
        }
        fig += h;
        super.drawFigure(fig);

    }




}
