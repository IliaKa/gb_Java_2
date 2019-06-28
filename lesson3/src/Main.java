import java.util.*;

public class Main {
    public static void main(String[] args) {


        UniqueWords uw = new UniqueWords();
        System.out.println("Task 1");
        List<String> words = new ArrayList<>();
        words.add("a");
        words.add("b");
        words.add("c");
        words.add("d");
        words.add("a");
        words.add("b");
        words.add("a");
        words.add("b");

        uw.getCountUniqueWords(words);
        uw.printUniqueWords(words);


        System.out.println("--------------");
        System.out.println("Task 2");

        PhoneBook b = new PhoneBook();
        b.add("Alex", "123");
        b.add("Alex", "321");
        b.add("Anna", "789");
        b.add("Anna", "789");
        b.add("John", "456");
        b.add("Artur", "111");

        b.get("Alex");
        b.get("Artur");
        b.get("Anna");
    }
}

