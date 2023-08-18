package if_else;

public class Condition3 {
    public static void main(String[] args) {

        if (67 == 78) { // false
            System.out.println(100);
        }
        else if (89 >= 23) { // true
            System.out.println(400);
            if (12 == 34) {
                System.out.println("Yes");
            } else if (78 != 78) {
                System.out.println("yep");
            } else if (66 < 156) {
                System.out.println("Oops");
                if (90 > 78) {
                    System.out.println("Salute");
                }
            }
        }
        else if (55 > 12) {
            System.out.println(300);
        }
        else {
            System.out.println(0);
        }
    }
}
