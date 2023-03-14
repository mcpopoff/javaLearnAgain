package org.example.javaLearnAgain.counterAggregation.model;

import org.example.javaLearnAgain.counterAggregation.consts.CountersConsts;

public class ColdWaterCounter extends Counter {
    public ColdWaterCounter(){
        this(0);
    }

    public ColdWaterCounter(int value){
        super(CountersConsts.COLD_WATER_COUNTER_NAME, CountersConsts.M3_UNIT, value);
    }

    public void print(){
        System.out.println(this.getName() + ": " + this.getValue() + this.getUNIT());
    }
}