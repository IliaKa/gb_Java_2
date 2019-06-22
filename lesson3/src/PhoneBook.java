import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class PhoneBook {
    private Map<String, HashSet<String>> phonebook;

    PhoneBook() { this.phonebook = new HashMap<>(); }

    void add(String name, String phone) {
        HashSet<String> book = phonebook.getOrDefault(name, new HashSet<>());
        book.add(phone);
        phonebook.put(name, book);
    }

    void get(String name) {
        System.out.printf("Name: %s - phone number(s): %s\n", name, phonebook.getOrDefault(name, new HashSet<>()));
    }

}