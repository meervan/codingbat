package Codiing777;

public class MissingChar {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1)); // Output: "ktten"
        System.out.println(missingChar("kitten", 0)); // Output: "itten"
        System.out.println(missingChar("kitten", 4)); // Output: "kittn"
    }

    public static String missingChar(String str, int n) {
        // Проверяем, что индекс n является допустимым индексом в строке str.
        if (n >= 0 && n < str.length()) {
            // Используем методы substring для создания новой строки без символа на позиции n.
            // Составляем новую строку, объединяя часть строки до индекса n и часть после него.
            return str.substring(0, n) + str.substring(n + 1);
        }
        // Возвращаем исходную строку, если индекс n не является допустимым.
        return str;
    }

}
