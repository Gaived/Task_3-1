import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Ivanov", 35));
        persons.add(new Person("Petr", "Ivanov-Petrov", 12));
        persons.add(new Person("Alex", "Ivanov-Petrov-Sidorov", 42));
        persons.add(new Person("Genri", "Petrov-Sidorov", 10));
        persons.add(new Person("Mark", "Petrov", 27));

        Collections.sort(persons, new PersonComparator());
        System.out.println(persons);

    }
}