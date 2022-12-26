import java.util.Comparator;

public class SurnameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int o1LenghtSur = o1.getSurname().split(" ").length;
        int o2LenghtSur = o2.getSurname().split(" ").length;
        if (Integer.compare(o1LenghtSur, o2LenghtSur) == 0 || (o1LenghtSur > 3 && o2LenghtSur > 3 )) {
            if (o1.getAge() < o2.getAge()) {
                return 1;
            }
            else if (o1.getAge() > o2.getAge()) {
                return -1;
            }
            else {
                return 0;
            }
        }
        return Integer.compare(o2.getSurname().split(" ").length, o1.getSurname().split(" ").length);
    }
}
