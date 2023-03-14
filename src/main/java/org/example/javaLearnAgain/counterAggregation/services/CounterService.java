package org.example.javaLearnAgain.counterAggregation.services;

import org.example.javaLearnAgain.counterAggregation.model.Counter;
import org.jetbrains.annotations.NotNull;

public class CounterService {
    private final Counter[] counters;

    public CounterService(Counter ...counters){
        this.counters = counters;
    }

    public Counter[] getCounters() {
        return counters;
    }

    public Counter getCounterByName(String name){
        for (Counter c: counters
             ) {
            if (c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }

    public void increase(String name, int count){
        Counter c = getCounterByName(name);
        if (c != null) {
            c.increase(count);
        }
    }

    public void increase(String name){
        increase(name,1);
    }

    public void increase(@NotNull Counter counter, int count){
        counter.increase(count);
    }

    public void increase(Counter counter){
        increase(counter, 1);
    }

    public void resetCounter(String name){
        Counter c = getCounterByName(name);
        if (c != null) {
            resetCounter(c);
        }
    }

    public void resetCounter(@NotNull Counter counter){
        counter.counterToZero();
    }


}
