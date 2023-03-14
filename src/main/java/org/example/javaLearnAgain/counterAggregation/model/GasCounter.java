package org.example.javaLearnAgain.counterAggregation.model;

import org.example.javaLearnAgain.counterAggregation.consts.CountersConsts;

public class GasCounter extends Counter {
    public GasCounter(){
        this(0);
    }

    public GasCounter(int value){
        super(CountersConsts.GAS_COUNTER_NAME, CountersConsts.M3_UNIT, value);
    }
}
