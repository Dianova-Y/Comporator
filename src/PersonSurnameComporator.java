import java.util.Comparator;

public class PersonSurnameComporator implements Comparator<Person> {
    private int maxChar;

    public PersonSurnameComporator(int maxChar) {
        this.maxChar = maxChar;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int word1 = o1.getSurname().split(" ").length;
        int word2 = o2.getSurname().split(" ").length;

        if (word1 == word2 || word1 > maxChar && word2 > maxChar) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return Integer.compare(word1, word2);
    }

}
