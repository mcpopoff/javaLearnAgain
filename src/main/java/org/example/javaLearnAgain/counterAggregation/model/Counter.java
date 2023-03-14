package org.example.javaLearnAgain.counterAggregation.model;

public class Counter {
    private final String NAME;
    private final String UNIT;
    private int value;


    public Counter(String name, String unit, int value){
        NAME = name;
        UNIT = unit;
        this.value = value;
    }
    public Counter(String name, String unit){
        this(name, unit,0);
    }

    public int getValue() {
        return value;
    }

    public int increase(int i){
        value += i;
        return getValue();
    }
    public int increase(){
        return increase(1);
    }

    public void counterToZero(){
        value = 0;
    }

    public String getName() {
        return NAME;
    }

    public String getUNIT() {
        return UNIT;
    }

    @Override
    public String toString(){
        return getName() + ": " + getValue() + getUNIT();
    }
}
