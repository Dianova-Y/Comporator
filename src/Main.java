import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Иванов Барабулькин", 64));
        people.add(new Person("Олег", "Цой", 25));
        people.add(new Person("Федор", "Ван Дер Варт", 32));
        people.add(new Person("Василий", "Триндаде де Вильена", 42));

        // Collections.sort(people, new PersonSurnameComporator(5));

        people.sort((o1, o2) -> {
                    int word1 = o1.getSurname().split(" ").length;
                    int word2 = o2.getSurname().split(" ").length;

                    if (word1 == word2 || word1 > 5 && word2 > 5) {
                        return Integer.compare(o1.getAge(), o2.getAge());
                    }
                    return Integer.compare(word1, word2);
                }
        );
        
        System.out.println(people);
    }
}
