package draft;

import java.util.HashMap;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово: ");
        String word = scanner.next();

        scanner.close();

        // Проверка на палиндром
        boolean isPalindrome = isPalindromeIgnoreCase(word);

        if (isPalindrome) {
            System.out.println("Слово \"" + word + "\" является палиндромом.");
        } else {
            System.out.println("Слово \"" + word + "\" не является палиндромом.");
        }

        // Создание и заполнение HashMap
        HashMap<Character, Character> caseMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            char uppercaseChar = Character.toUpperCase(currentChar);
            char lowercaseChar = Character.toLowerCase(currentChar);
            caseMap.put(uppercaseChar, lowercaseChar);
        }

        // Вывод HashMap
        System.out.println("Ключи (большие буквы) и значения (маленькие буквы) в HashMap:");
        for (char key : caseMap.keySet()) {
            char value = caseMap.get(key);
            System.out.println("Ключ: " + key + ", Значение: " + value);
        }
    }

    public static boolean isPalindromeIgnoreCase(String word) {
        word = word.replaceAll("\\s", "").toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}





