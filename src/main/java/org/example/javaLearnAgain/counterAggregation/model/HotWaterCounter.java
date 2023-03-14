package org.example.javaLearnAgain.counterAggregation.model;

import org.example.javaLearnAgain.counterAggregation.consts.CountersConsts;

public class HotWaterCounter extends Counter {
    public HotWaterCounter(){
        this(0);
    }

    public HotWaterCounter(int value){
        super(CountersConsts.HOT_WATER_COUNTER_NAME, CountersConsts.M3_UNIT, value);
    }
}