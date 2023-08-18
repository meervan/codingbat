package string_methods;

public class StringMethods2 {
    public static void main(String[] args) {
       /* В Java, "String" представляет собой класс, используемый для работы с последовательностями символов.
       Этот класс находится в пакете `java.lang`, поэтому импортировать его не требуется, так как классы из пакета
       `java.lang` автоматически импортируются во все Java-программы.

                Вот некоторые основные операции и свойства, которые можно использовать с классом String в Java:*/

       // 1. Создание строк:
        String str1 = "Hello, world!";
        String str2 = new String("Java Strings");


        //2. Объединение строк (конкатенация):
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName; // "John Doe"

       // 3. Получение длины строки:

        int length = str1.length(); // вернет длину строки str1


        //4. Извлечение символов из строки:

        char firstChar = str1.charAt(0); // первый символ строки str1


        //5. Сравнение строк:
        boolean isEqual = str1.equals(str2); // сравнение содержимого строк
        boolean isIgnoreCaseEqual = str1.equalsIgnoreCase(str2); // сравнение без учета регистра


        //6. Поиск подстроки:

        int index = str1.indexOf("world"); // индекс начала подстроки "world" в строке str1


        //7. Извлечение подстроки:
        String subString = str1.substring(7, 12); // извлечение подстроки с индекса 7 до 11


       // 8. Замена подстроки:

        String newStr = str1.replace("world", "universe"); // замена "world" на "universe"


        //9. Разделение строки на массив подстрок:

        String[] words = str1.split(", "); // разделение строки по запятой и пробелу


        //10. Удаление начальных и конечных пробелов:

        String trimmedStr = str1.trim(); // удаление начальных и конечных пробелов


        //11. Преобразование регистра:
        String upperCase = str1.toUpperCase(); // преобразование в верхний регистр
        String lowerCase = str1.toLowerCase(); // преобразование в нижний регистр


       // Строки в Java являются неизменяемыми, что означает, что после создания строки ее нельзя изменить.
        // Все операции, модифицирующие строку, на самом деле создают новую строку с изменениями.
    }
}
