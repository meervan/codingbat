package draft;

public class Makes10 {
    public static void main(String[] args) {
        boolean result1 = makes10(9, 19);
        boolean result2 = makes10(2, 8);
        boolean result3 = makes10(10, 1);

        System.out.println("Result 1: " + result1 );
        System.out.println("Result 2: " + result2 );
        System.out.println("Result 3: " + result3 );

    }

    public  static boolean makes10 (int a, int b){
        if (a==10 || b == 10 || a+b ==10){
            return true;
        }
        else {
            return false;
        }


        }

    }




