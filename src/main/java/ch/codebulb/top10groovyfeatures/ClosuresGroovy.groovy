package ch.codebulb.top10groovyfeatures

import groovy.transform.CompileStatic

@CompileStatic
class ClosuresGroovy {
    private static final List<String> INPUT_LIST = ["a", "b", "c"]
    
    public static List<String> collect() {
        return INPUT_LIST.collect {it.toUpperCase()}
    }
    
    public static List<String> collectMultiStatement() {
        return INPUT_LIST.collect {String ret = it.toUpperCase(); ret}
    }
}
