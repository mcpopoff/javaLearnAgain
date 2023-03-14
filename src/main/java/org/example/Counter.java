package org.example;

public class Counter {
    private final String NAME;
    private int value;

    Counter(String name, int value){
        NAME = name;
        this.value = value;
    }
    Counter(String name){
        this(name, 0);
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

    public String getName() {
        return NAME;
    }
    @Override
    public String toString(){
        return getName() + ": " + getValue();
    }
}
