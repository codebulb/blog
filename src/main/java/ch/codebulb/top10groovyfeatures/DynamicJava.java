package ch.codebulb.top10groovyfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicJava {
    private static final List<?> INVENTORY = new ArrayList<>(Arrays.asList(
        new Car(), new Car(),
        new TV(), new TV(), new TV()
    ));
    
    private static class Car {
        public final int cost = 10000;
    }
    
    private static class TV {
        public final int cost = 1000;
    }
    
    public static int sumDynamic() {        
        return INVENTORY.stream().mapToInt(it -> {
            if (it instanceof Car) {
                return ((Car)it).cost;
            }
            else if (it instanceof TV) {
                return ((TV)it).cost;
            }
            else {
                throw new IllegalArgumentException("Unexpected type: " + it);
            }
        }).sum();
    }
}
