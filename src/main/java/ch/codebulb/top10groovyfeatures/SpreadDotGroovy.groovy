package ch.codebulb.top10groovyfeatures

import groovy.transform.CompileStatic

@CompileStatic
class SpreadDotGroovy {
    protected static final List<String> INPUT_LIST = ["a", "b", "c"].asImmutable()
    
    public static List<String> spreadDot() {
        return INPUT_LIST*.toUpperCase()
    }
}
