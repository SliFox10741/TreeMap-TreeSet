import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Maxim","Guselnikov Petrov King Eight Konovalov",8));
        peoples.add(new Person("Roman","Pupkin ",14));
        peoples.add(new Person("Boris","Diadkin",64));
        peoples.add(new Person("katya","Franken Vinissuella",32));
        peoples.add(new Person("Vasya","Asgin Berlin Moscow Kusnecov",90));


        Comparator<Person> surnameComparator = (Person o1, Person o2) -> {
            int o1LenghtSur = o1.getSurname().split(" ").length;
            int o2LenghtSur = o2.getSurname().split(" ").length;
            if (o1LenghtSur == o2LenghtSur || (o1LenghtSur > 3 && o2LenghtSur > 3 )) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
            return Integer.compare(o2.getSurname().split(" ").length, o1.getSurname().split(" ").length);
        };

        peoples.sort(surnameComparator);
        System.out.println(peoples);

    }
}

