package ch.codebulb.top10groovyfeatures

import groovy.transform.CompileStatic

@CompileStatic
class PropertiesGroovy {
    private static class Person {
        String name
        int age
        boolean active
        Person father
    }
    
    public static List<?> getPropertiesList() {
        Person person = new Person(name: "Tim")
        person.age = 20
        person.active = true
        
        // set grandfather
        person.father = new Person(name: "Tim's father")
        person.father.father = new Person(name: "Tim's grandfather")
        
        return [person.name, person.age, person.active, person.father.father.name]
    }
}
