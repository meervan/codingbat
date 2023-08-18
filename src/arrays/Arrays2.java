package arrays;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String [] countries = new String[3];
        countries[0] = "America";
        countries[1] = "Kyrgyzstan";
        countries[2] = "Uzbekistan";


        System.out.println(Arrays.toString(countries));
        countries [0]="USA";
        System.out.println(Arrays.toString(countries));
        System.out.println(countries[2]);

        for (String i: countries){
            countries[1]= "Russia";
            System.out.println(Arrays.toString(countries));
        }

    }
}
