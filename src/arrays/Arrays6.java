package arrays;

import java.util.Scanner;

public class Arrays6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxAtt = 3;
        int att = 0;
        while (att < maxAtt){
            System.out.println("Enter Arrays length from 1 to 5");
            int num = scan.nextInt();
            att++;
            if (num >= 1 && num <= 5) {
                String[] fruits = new String[num];
                for (int i = 0; i < fruits.length; i++) {
                    System.out.print("Enter fruits name " + (i + 1) + ":");
                    fruits[i] = scan.next();
                    System.out.println("Fruit " + (i + 1) + " " + fruits[i]);
                }
                break;
            } else {
                System.err.println("Error");
            }
        }

    }
}
