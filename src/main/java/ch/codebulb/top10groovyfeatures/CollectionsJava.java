package ch.codebulb.top10groovyfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsJava {
    public static List<?> getList1() {
        List<Object> ret = new ArrayList<>();
        ret.add(1);
        ret.add(2);
        ret.add(3);
        List<Object> innerList = new ArrayList<>();
        innerList.add(4);
        innerList.add(5);
        ret.add(innerList);
        return ret;
    }
    
    public static List<?> getList2() {
        // Note that Arrays.asList(...) returns a fixed-size list
        // see http://stackoverflow.com/a/2965808
        return new ArrayList<>(Arrays.asList(1, 2, 3, 
                new ArrayList<>(Arrays.asList(4, 5)))
        );
    }
    
    public static Map<String, Integer> getMap() {
        Map<String, Integer> ret = new HashMap<>();
        ret.put("John", 30);
        ret.put("Alice", 40);
        ret.put("Mike", 50);
        return ret;
    }
}
