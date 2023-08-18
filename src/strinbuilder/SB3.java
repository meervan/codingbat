package strinbuilder;

import java.util.Scanner;

public class SB3 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Clark");

        StringBuilder sb2 = new StringBuilder("Will");
        sb2.reverse();
        System.out.println(sb2);
        sb2.append("Smith");
        System.out.println(sb2);

        String baselogin = "ruslan@gmail.com";
        String basePassword = "bishkek312";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your login");
        String userlogin = scanner.next();
        System.out.println("Please enter your password");
        String userPassword = scanner.next();


    }



}
