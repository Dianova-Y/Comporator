import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Иванов Барабулькин", 64));
        people.add(new Person("Олег", "Цой", 25));
        people.add(new Person("Федор", "Ван Дер Варт", 32));
        people.add(new Person("Василий", "Триндаде де Вильена", 42));

        Collections.sort(people, new PersonSurnameComporator(5));
        System.out.println(people);
    }
}
