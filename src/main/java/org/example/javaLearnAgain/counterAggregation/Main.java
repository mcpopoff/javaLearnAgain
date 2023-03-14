package org.example.javaLearnAgain.counterAggregation;

import org.example.javaLearnAgain.counterAggregation.consts.CountersConsts;
import org.example.javaLearnAgain.counterAggregation.model.*;
import org.example.javaLearnAgain.counterAggregation.services.CounterService;

public class Main {
    public static void main(){
        Counter gasCounter = new GasCounter();
        Counter hotWaterCounter = new HotWaterCounter();
        Counter coldWaterCounter = new ColdWaterCounter();
        Counter electricCounter = new ElectricCounter();

        ColdWaterCounter c = (ColdWaterCounter) coldWaterCounter;
        c.print();

        CounterService cs = new CounterService(gasCounter,hotWaterCounter,coldWaterCounter,electricCounter);
        cs.increase(CountersConsts.GAS_COUNTER_NAME, 100);
        cs.increase(cs.getCounterByName(CountersConsts.HOT_WATER_COUNTER_NAME), 101);
        cs.increase(CountersConsts.COLD_WATER_COUNTER_NAME);
        cs.increase(cs.getCounterByName(CountersConsts.ELECTRIC_COUNTER_NAME));
        printCounters(cs);
        cs.resetCounter(CountersConsts.ELECTRIC_COUNTER_NAME);
        cs.resetCounter(cs.getCounterByName(CountersConsts.HOT_WATER_COUNTER_NAME));
        printCounters(cs);
    }

    private static void printCounters(CounterService cs){
        for (Counter c:cs.getCounters()) {
            System.out.println(c);
        }


    }
}
