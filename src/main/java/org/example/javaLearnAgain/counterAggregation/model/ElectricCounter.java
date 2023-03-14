package org.example.javaLearnAgain.counterAggregation.model;

import org.example.javaLearnAgain.counterAggregation.consts.CountersConsts;

public class ElectricCounter extends Counter {
    public ElectricCounter(){
        this(0);
    }

    public ElectricCounter(int value){
        super(CountersConsts.ELECTRIC_COUNTER_NAME, CountersConsts.KWH_UNIT, value);
    }
}