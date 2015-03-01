package ch.codebulb.top10groovyfeatures

import groovy.transform.CompileStatic

@CompileStatic
class SwitchGroovy {
    public static String switchCase(Object input) {
        switch (input) {
            case "S":
                return "It's the String 'S'."
            case {it in String && (it as String).startsWith('S')}:
                return "It starts with 'S'."
            case ~/^[A-Z].*/:
                return "It starts in upper case."
            case String:
                return "It's a String."
            case Integer:
                return "It's an Integer."
            default:
                return "It's anything else."
        }
    }
}
