package date_type.arrayliast2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListHomeWork {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("winter");
        collection.add("spring");
        collection.add("fall");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner.nextLine();

        if (isMatchingSummer(word)) {
            collection.add(2, word);
        }

        System.out.println("Коллекция после добавления: ");
        for (String item : collection) {
            System.out.println(item);
        }
    }

    private static boolean isMatchingSummer(String word) {
        if (word.length() != 6) {
            return false;
        }

        char[] summerChars = {'s', 'u', 'm', 'm', 'e', 'r'};
        char[] wordChars = word.toCharArray();

        for (int i = 0; i < 6; i++) {
            if (summerChars[i] != wordChars[i]) {
                return false;
            }
        }

        return true;
    }
}

