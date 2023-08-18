package scanner;

import java.util.Scanner;

public class MyScanner2 {
    public static void main(String[] args) {
        System.out.println("Первая: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Вторая: ");
        int b = new Scanner(System.in).nextInt();


        if (a > 5 && b < 5){
            System.out.println("Hello World");

        }
        if (a < 5 || b > 5){
            System.out.println("Goodbye World");

        }
    }
}
