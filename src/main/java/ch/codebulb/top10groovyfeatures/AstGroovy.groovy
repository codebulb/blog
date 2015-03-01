package ch.codebulb.top10groovyfeatures

import groovy.transform.*

@CompileStatic
class AstGroovy {
    @TupleConstructor
    @EqualsAndHashCode
    @ToString(includePackage=false)
    @Sortable // as of 2.4, does not work with fields, only properties
    private static class Address {
        final String street
        final int number
    }
    
    public static String intoString() {
        return new Address("Main Road", 42).toString()
    }
    
    public static boolean equals() {
        return new Address("Main Road", 42) ==
            new Address("Main Road", 42)
    }
    
    public static List<String> sort() {
        return sort(new Address("Second Street", 1), new Address("Main Road", 43), 
            new Address("Main Road", 42))
    }
    
    public static List<String> sort(Object... input) {
        return input.sort()*.toString()
    }
}
