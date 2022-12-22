import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Maxim","Guselnikov",8);
        TreeMap<Person, Integer> peoples = new TreeMap<>();
        Collections.sort(peoples, КОМПАРАТОР);
    }
}

