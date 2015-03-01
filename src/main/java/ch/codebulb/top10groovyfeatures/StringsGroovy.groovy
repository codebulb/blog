package ch.codebulb.top10groovyfeatures

import groovy.transform.CompileStatic

@CompileStatic
class StringsGroovy {
    public static String getString(String input) {
        return "Input String is $input with ${input.size()} characters."
    }
}
