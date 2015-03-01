package ch.codebulb.top10groovyfeatures;

import java.text.MessageFormat;

public class StringsJava {
    public static String getString1(String input) {
        StringBuilder ret = new StringBuilder("Input String is ");
        ret.append(input);
        ret.append(" with ");
        ret.append(input.length());
        ret.append(" characters.");
        return ret.toString();
    }
    
    public static String getString2(String input) {
        String pattern = "Input String is {0} with {1} characters.";
        return MessageFormat.format(pattern, input, input.length());
    }
}
