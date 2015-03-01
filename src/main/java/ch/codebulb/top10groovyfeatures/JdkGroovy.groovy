package ch.codebulb.top10groovyfeatures

import groovy.transform.CompileStatic

@CompileStatic
class JdkGroovy {
    private static final List<String> INPUT_LIST = ["a", "b", "c"]
    
    public static String getAt() {
        INPUT_LIST[-1] = "Z"
        return INPUT_LIST[-1]
    }
    
    protected static final List<?> INPUT_NESTED_LIST = [1, 2, [31, 32, [331], 34], 4, 5].asImmutable()
    
    public static List<Integer> flattenList() {
        return INPUT_NESTED_LIST.flatten() as List<Integer>
    }
}
