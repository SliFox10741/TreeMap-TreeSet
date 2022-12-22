import java.util.Comparator;

public class SurnameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (Integer.compare(o1.getSurname().length(), o2.getSurname().length()) == 0) {
            if (o1.getAge() < o2.getAge())
                return 1;
            else if (o1.getAge() > o2.getAge())
                return -1;
            else
                return 0;
        }
        return Integer.compare(o2.getSurname().length(), o1.getSurname().length());
    }
}
