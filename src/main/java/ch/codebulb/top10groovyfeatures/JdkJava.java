package ch.codebulb.top10groovyfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JdkJava {
    private static final List<String> INPUT_LIST = new ArrayList<>(Arrays.asList("a", "b", "c"));
    
    public static String getAt() {
        INPUT_LIST.remove(INPUT_LIST.size()-1);
        INPUT_LIST.add("Z");
        return INPUT_LIST.get(INPUT_LIST.size()-1);
    }
    
    static List<?> INPUT_NESTED_LIST = JdkGroovy.INPUT_NESTED_LIST;
    
    public static List<Integer> flattenList() {
        return flattenList(INPUT_NESTED_LIST);
    }
    
    private static List<Integer> flattenList(List<?> list) {
        List<Integer> ret = new ArrayList<>();
        for (Object elem : list) {
            if (elem instanceof List) {
                ret.addAll(flattenList((List<?>) elem));
            }
            else {
                ret.add((Integer) elem);
            }
        }
        return ret;
    }
}
