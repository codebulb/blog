package ch.codebulb.top10groovyfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClosuresJava {
    private static final List<String> INPUT_LIST = new ArrayList<>(Arrays.asList("a", "b", "c"));
    
    public static List<String> collect() {
        return INPUT_LIST.stream().map(it -> it.toUpperCase())
                .collect(Collectors.toList());
    }
    
    public static List<String> collectMultiStatement() {
        // Mind the brackets, the return keyword and the conclusive semicolon!
        return INPUT_LIST.stream().map(it -> {String ret = it.toUpperCase(); return ret;})
                .collect(Collectors.toList());
    }
}
