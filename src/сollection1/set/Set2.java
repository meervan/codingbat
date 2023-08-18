package сollection1.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {


                // Создаем множество городов
                Set<String> citySet = new HashSet<>();
                citySet.add("Москва");
                citySet.add("Лондон");
                citySet.add("Париж");
                citySet.add("Нью-Йорк");
                citySet.add("Бишкек");
                citySet.add("Токио");

                System.out.println("Исходное множество городов: " + citySet);

                // Извлекаем город "Бишкек"
                Iterator<String> iterator = citySet.iterator();
                while (iterator.hasNext()) {
                    String city = iterator.next();
                    if (city.equals("Бишкек")) {
                        System.out.println("Извлеченный город: " + city);
                        break;
                    }
                }
            }
        }




