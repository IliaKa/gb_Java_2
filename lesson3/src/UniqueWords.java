import java.util.*;

class UniqueWords {


    void getCountUniqueWords(List words) {
        System.out.println("Count how many times each word occurs:");
        HashSet set = new HashSet<>(words);
        for (Object s : set) {
            System.out.println(s + ": " + Collections.frequency(words, s));
        }
    }

    void printUniqueWords(List words) {
        for (int i = 0; i <= words.size() - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (words.get(i).equals(words.get(j))) {
                    words.remove(j);
                    i--;
                }
            }
        }
        System.out.printf("Unique elements in list: %s\n", words);
    }
}

