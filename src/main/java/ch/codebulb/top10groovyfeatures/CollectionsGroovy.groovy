package ch.codebulb.top10groovyfeatures

import groovy.transform.CompileStatic

@CompileStatic
class CollectionsGroovy {
    public static List<?> getList() {
        return [1, 2, 3, [4, 5]]
    }
    
    public static Map<String, Integer> getMap() {
        return [
            John: 30,
            Alice: 40,
            Mike: 50,
        ]
    }
}
