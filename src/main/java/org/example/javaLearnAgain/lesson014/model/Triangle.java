package org.example.javaLearnAgain.lesson014.model;

public class Triangle extends TrueFigure{
    private String leftSide = "/";
    private String rightSide = "\\";
    private String bottom = "-";

    public Triangle(int length) {
        super(length);
    }

    private String getHLine(int count, String symb){
        String res = "";
        for (int i = 0; i < count; i++){
            res += symb;
        }
        return res;

    }

    private String getSpaces(int count){
        return getHLine(count, space);
    }

    private  String getBottom(int count){
        return getHLine(count, bottom);
    }

    public void drawFigure(){
        String fig = "";
        for (int i = 0; i < length; i++){
            fig += getSpaces(length -i - 1) + leftSide + getSpaces(i*2) + rightSide + nextLine;
            if (i == length - 1){
                fig += getBottom((i + 1)*2);
            }
        }

        super.drawFigure(fig);

    }
}
