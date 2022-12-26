import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Maxim","Guselnikov Petrov King Eight Konovalov",8));
        peoples.add(new Person("Roman","Pupkin ",14));
        peoples.add(new Person("Boris","Diadkin",64));
        peoples.add(new Person("katya","Franken Vinissuella",32));
        peoples.add(new Person("Vasya","Asgin Berlin Moscow Kusnecov",90));


        SurnameComparator surnameComparator = new SurnameComparator();

        peoples.removeIf(xx -> xx.getAge() < 18);
        peoples.sort(surnameComparator);
        System.out.println(peoples);

    }
}

