package date_type;

public class DataTypes2 {
    public static void main(String[] args) {
         int num = 89;

         //Data types:
        //1. Primitive     --> byte, short, int, long/ float,double/ char/ boolean
        //2. non-primitive --> string

        //char    -->'j'
        //string  -->"hello"

        String str= "Hello";
        String str2= "k";

        char ch1 = ' ';

        //Casting

        byte n1 = 78;
        byte n2 = 90;
        System.out.println(n1); //78
        System.out.println(n2);
        System.out.println(n1+n2); //78+90 = 168

        n1 = 55;
        n1 = 42;
        System.out.println(n1);

        byte n3 = 67;
        short n4 = 23;
        short n5 = n4; // 23
        System.out.println(n5);
        n5 = 20;
        System.out.println(n5);

        // 1 = 2
        // byte = short
        // -128/127 = -3223456/3245789
        // 67 = 20


        // 67
        //byte = (byte) short
        n3 = (byte)n5; //20
        System.out.println(n3);


        int n6 = 284;
     //   long = int
        long n7 = n6;

        long n8 = n5;

        long n9 = 28;
        byte n10 = (byte)n9;
        System.out.println(n10);

        int num7 = 28;
        double num8 = num7; // 78
        System.out.println(num8);

        int num9 = (int)56.8;
        System.out.println(num9);








    }
}
