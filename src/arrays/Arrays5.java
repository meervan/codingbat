package arrays;

import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {
        String[] args1 = args;

            String str = new String("Privet");
            char [] arrs = new char[6];
            for (int i =0; i<6; i++) {
                //   0  =   P
                //   1  =   r
                //   2  =   i
                //   3  =   v
                //   4  =   e
                //   5  =   t

                arrs[i] = str.charAt(i);// naznachit
            }
            System.out.println(Arrays.toString(arrs));
        }
    }

