package string_methods;

import java.util.*;

public class AlmostAllMethods {
    public static void main(String[] args) {
        //Конечно! Вот список некоторых не примитивных классов и их основных операций в Java:

       //1.String в другом классе StringMethods2


        //2. **ArrayList** (динамический массив):

 //import ArrayList;

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5); // добавление элемента
        int value1 = numbers.get(0); // получение элемента


       // 3. **LinkedList** (связанный список):

//import LinkedList;

        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        String firstName = names.getFirst();


//        4. **HashMap** (хеш-таблица):

//import HashMap;

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25); // добавление пары ключ-значение
        int aliceAge = ages.get("Alice"); // получение значения по ключу


//        5. **HashSet** (множество без дубликатов):

//import HashSet;

        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        boolean containsAlice = uniqueNames.contains("Alice"); // проверка наличия элемента


//        6. **LinkedList** (двусвязный список):

//import LinkedList;

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        String firstElement = linkedList.getFirst();


//        7. **ArrayList** (динамический массив):

//import ArrayList;

        ArrayList<Double> doubleList = new ArrayList<>();
        boolean add = doubleList.add(3.14);
        double value = doubleList.get(0);

        //8. **StringBuilder** (динамическая строка для эффективной конкатенации):

        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(", ");
        builder.append("world!");
        String result = builder.toString();


//        9. **Stack** (стек):

//import Stack;

        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        String topElement = stack.peek();


//        10. **Queue** (очередь):

//import LinkedList;
//import Queue;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        int frontElement = queue.poll();


//        Это лишь небольшой перечень не примитивных классов и операций, доступных в Java.
//        Java также предоставляет множество других классов из библиотеки Java Standard
//        Library для обработки различных типов данных и задач.
    }
}
