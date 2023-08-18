package arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int num = 90;
        StringBuilder sb1 = new StringBuilder("James");
        sb1.append(" Bond");

        // 1 way
        int [] arrs = new int[2];
        arrs[0] = 67;
        arrs[1] = 89;
        System.out.println(Arrays.toString(arrs));
        System.out.println(arrs[0]);
        System.out.println(arrs[1]);

        // 2 way                 0  1  2
        int [] arrs2 = new int[]{23,64,18};
        //                       1  2  3
        System.out.println(arrs2[2]);
        System.out.println(Arrays.toString(arrs2));

        String cities [] = new String[3];
        cities[0] = "London";
        System.out.println(cities[0]);
        System.out.println(Arrays.toString(cities));

        boolean [] arrs3 = new boolean[2];
        System.out.println(Arrays.toString(arrs3));

        byte [] arrs4 = new byte[2];
//      arrs4[0] = 0
//        arrs4[1] = 55;
        System.out.println(Arrays.toString(arrs4));

        int num2 = 90;
        System.out.println(num2); // 90


        byte[] arrs5 = new byte[130];

        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder("Salam");
        System.out.println(sb3.toString());

        StringBuilder sb4 [] = new StringBuilder[]{sb2, sb3};
        System.out.println(Arrays.toString(sb4));


        String[] colors = new String[]{"White", "Green", "Pink", "Yellow"};
        System.out.println(Arrays.toString(colors)); // [White, Green, Pink, Yellow]
        colors[2] = "Purple";
        System.out.println(Arrays.toString(colors)); // [White, Green, Purple, Yellow]

        // for each
        for (String i : colors){ // 4
//           String i = "White"
//           String i = "Green"
//           String i = "Purple"
//           String i = "Yellow"
            System.out.println(i); // White, Green, Purple, Yellow
        }
    }
}
