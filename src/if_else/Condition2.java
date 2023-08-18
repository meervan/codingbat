package if_else;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {

        /*int age = 1100;
        //       False
        //  true          false
        // 1100 > 16      1100 <= 110
        if (age>= 16 && age <= 110){
            System.out.println("Get passport");

        }
        else {
            System.out.println("Can not get a passport");
        }*/
        
        /* int age1 = 2;
        
        if ( age1>=0){
            System.out.println("Can get international passport");
            
        } else if (age1>=16 && age1 <= 110) {
            System.out.println("ID Passport || International Passport");
        }
        else {
            System.out.println("No Passport");
        }

        // A -> 90 - 100
        // B -> 70 - 89
        // C -> 40 - 69
        // D -> < 40 */

        System.out.println("----------------------");

        Scanner scan = new Scanner(System.in);
        char gradeletter = ' ';
        System.out.println("What is your grade?");
        int grade = scan.nextInt();
        if (grade >= 90 && grade <= 100) {
            gradeletter = 'A';
        } else if (grade >=70 && grade <=89) {
            gradeletter = 'B';
        } else if (grade >= 40 && grade <=69) {
            gradeletter= 'C';
        } else if (grade >= 0 && grade <= 39) {
            gradeletter = 'D';
        } else {
            System.out.println("Not grade");
        }

        System.out.println(gradeletter);

//         | 0.........39 | 40.........69 | 70.........89 | 90.........100 |
//          D < 39 = 0 1 2 3 ....37 38
//          0 <= 40 = 0 1 2 3....37 38 39 40
        System.out.println("---------------");

        // nested if
         boolean citizen = false;
         int age3 = 5;

         if (citizen == true) {
             System.out.println("KG citizen");
             if (age3 >= 16) {
                 System.out.println("Get ID Passport");

             } else {
                 System.out.println("Not valid age for ID Passport");
             }
         } else {
             System.out.println("You are no a citizen of KG");

         }
    }
}

// redundant
// optional


