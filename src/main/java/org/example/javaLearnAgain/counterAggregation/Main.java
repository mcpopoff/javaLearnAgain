package org.example.javaLearnAgain.counterAggregation;

import org.example.javaLearnAgain.counterAggregation.consts.CountersConsts;
import org.example.javaLearnAgain.counterAggregation.model.Counter;
import org.example.javaLearnAgain.counterAggregation.services.CounterService;

public class Main {
    public static void main(){
        Counter gasCounter = new Counter(CountersConsts.GAS_COUNTER_NAME,CountersConsts.M3_UNIT);
        Counter hotWaterCounter = new Counter(CountersConsts.HOT_WATER_COUNTER_NAME,CountersConsts.M3_UNIT);
        Counter coldWaterCounter = new Counter(CountersConsts.COLD_WATER_COUNTER_NAME,CountersConsts.M3_UNIT);
        Counter electricCounter = new Counter(CountersConsts.ELECTRIC_COUNTER_NAME,CountersConsts.KWH_UNIT);

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
