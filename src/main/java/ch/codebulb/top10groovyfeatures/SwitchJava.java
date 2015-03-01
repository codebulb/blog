package ch.codebulb.top10groovyfeatures;

public class SwitchJava {
    public static String switchCase(Object input) {
        if (input.equals("S")) {
            return "It's the String 'S'.";
        }
        if (input instanceof String) {
            String stringInput = (String) input;
            if (stringInput.startsWith("S")) {
                return "It starts with 'S'.";
            }
            if (stringInput.matches("^[A-Z].*")) {
                return "It starts in upper case.";
            }
            return "It's a String.";
        }
        if (input instanceof Integer) {
            return "It's an Integer.";
        }
        return "It's anything else.";
    }
}
