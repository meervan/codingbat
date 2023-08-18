package string_methods;

import java.util.*;

public class AllmostAllmethods1 {
    public static void main(String[] args) {
      //  Конечно, вот продолжение списка классов и операций для работы с не примитивными данными в Java:

       // 11. **LinkedHashMap** (упорядоченная хеш-таблица):

        LinkedHashMap<String, Integer> orderedMap = new LinkedHashMap<>();
        orderedMap.put("One", 1);
        orderedMap.put("Two", 2);


       // 12. **TreeMap** (сортированная карта на основе дерева):



        TreeMap<String, Double> treeMap = new TreeMap<>();
        treeMap.put("Apple", 1.25);
        treeMap.put("Banana", 0.75);
        String firstKey = treeMap.firstKey();


       // 13. **PriorityQueue** (очередь с приоритетом):


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(5);
        priorityQueue.offer(3);
        int minValue = priorityQueue.poll();

       // 14. **Object HashSet;
        Object HashSet;
        //HashSet** (множество без дубликатов):



        HashSet<Character> charSet = new HashSet<>();
        charSet.add('a');
        charSet.add('b');
        boolean containsA = charSet.contains('a');

//        15. **TreeSet** (множество с сортировкой на основе дерева):



        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        String firstItem = treeSet.first();


//        16. **Vector** (вектор, динамический массив с синхронизацией):



        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        int firstValue = vector.firstElement();


        //17. **Hashtable** (устаревший аналог HashMap с синхронизацией):


        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");
        String valueForKey1 = hashtable.get("key1");


        //18. **EnumSet** (множество для перечислений):



        enum Days { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

        EnumSet<Days> weekendSet = EnumSet.of(Days.SATURDAY, Days.SUNDAY);


 //       19. **BitSet** (набор битов):



        BitSet bitSet = new BitSet(8); // создание BitSet с 8 битами
        bitSet.set(2); // установка бита под индексом 2
        boolean isSet = bitSet.get(2); // проверка, установлен ли бит


        //20. **Optional** (класс для представления возможного отсутствия значения):



        Optional<String> optionalValue = Optional.ofNullable(null);
        boolean isPresent = optionalValue.isPresent(); // проверка наличия значения
        String value = optionalValue.orElse("Default"); // получение значения или дефолтного значения


        //1.Random (генерация случайных чисел):

        Random random = new Random();
        int randomNumber = random.nextInt(100); // случайное число от 0 до 99

       //2.Collections (утилитарные методы для работы с коллекциями):

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        Collections.sort(numbers); // сортировка списка
        int maxNumber = Collections.max(numbers); // нахождение максимального числа


    }
}
