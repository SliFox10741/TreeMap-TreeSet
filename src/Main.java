import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Maxim","Guselnikov Petrov King Eight Konovalov",8));
        peoples.add(new Person("Roman","Pupkin ",14));
        peoples.add(new Person("Boris","Diadkin",64));
        peoples.add(new Person("katya","Franken Vinissuella",32));
        peoples.add(new Person("Vasya","Asgin Berlin Moscow Kusnecov",90));


        SurnameComparator surnameComparator = new SurnameComparator();

        Collections.sort(peoples, surnameComparator);
        System.out.println(peoples);

    }
}

