package ch.codebulb.top10groovyfeatures;

import java.util.List;
import java.util.Objects;

public class AstJava {
    private static class Address implements Comparable<Address>{
        private final String street;
        private final int number;

        public Address(String street, int number) {
            this.street = street;
            this.number = number;
        }

        public String getStreet() {
            return street;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 29 * hash + Objects.hashCode(this.street);
            hash = 29 * hash + this.number;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Address other = (Address) obj;
            if (!Objects.equals(this.street, other.street)) {
                return false;
            }
            if (this.number != other.number) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "AstGroovy$Address(" + street + ", " + number + ")";
        }

        @Override
        public int compareTo(Address obj) {
            int last = this.street.compareTo(obj.street);
            return last == 0 ? ((Integer)this.number).compareTo(obj.number) : last;
        }
    }
    
    public static String intoString() {
        return new Address("Main Road", 42).toString();
    }
    
    public static boolean equals() {
        return new Address("Main Road", 42).equals(new Address("Main Road", 42));
    }
    
    public static List<String> sort() {
        return AstGroovy.sort(new Object[]{
            new Address("Second Street", 1), 
            new Address("Main Road", 43), 
            new Address("Main Road", 42)});
    }
}
