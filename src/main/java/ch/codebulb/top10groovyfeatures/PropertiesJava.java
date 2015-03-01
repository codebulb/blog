package ch.codebulb.top10groovyfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PropertiesJava {
    private static class Person {
        private String name;
        private int age;
        private boolean active;
        private Person father;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }

        public Person getFather() {
            return father;
        }

        public void setFather(Person father) {
            this.father = father;
        }
    }
    
    public static List<?> getPropertiesList() {
        Person person = new Person();
        person.setName("Tim");
        person.setAge(20);
        person.setActive(true);
                
        // set grandfather
        person.setFather(new Person());
        person.getFather().setName("Tim's father");
        person.getFather().setFather(new Person());
        person.getFather().getFather().setName("Tim's grandfather");
        
        return new ArrayList<>(Arrays.asList(
            person.getName(), person.getAge(), person.isActive(),
            person.getFather().getFather().getName()
        ));
    }
}
