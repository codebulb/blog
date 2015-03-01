package ch.codebulb.top10groovyfeatures;

import java.util.List;
import java.util.stream.Collectors;

public class SpreadDotJava {
    private static final List<String> INPUT_LIST = SpreadDotGroovy.INPUT_LIST;
            
    public static List<String> spreadDot() {
        return INPUT_LIST.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
