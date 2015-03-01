package ch.codebulb.top10groovyfeatures

import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic

@CompileStatic
public class DynamicGroovy {
    private static final List<?> INVENTORY = [
        new Car(), new Car(),
        new TV(), new TV(), new TV()
    ]
    
    private static class Car {
        public final int cost = 10000
    }
    
    private static class TV {
        public final int cost = 1000
    }
    
    @CompileDynamic
    public static int sumDynamic() {
        return INVENTORY.sum { it.cost } as int
    }
}
