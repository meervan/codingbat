package arrays;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {

                double[] ars = {25.2, 32.4, 45.6, 23.65};
                //             [23.65, 25.2, 32.4, 45.6]
                System.out.println(Arrays.toString(ars));
                Arrays.sort(ars);
                System.out.println(Arrays.toString(ars));
                System.out.println(binarySearch(ars,23.65));
            }
            public static int binarySearch(double[] arr, double target) {
                int left = 0;
                int right = arr.length - 1; //3
                // 0    <=  3
                while (left <= right) {
                    //         0   +   3    - 0
                    int mid = left + (right - left) / 2; //1
                    //  arr[1]   =    23.65 (0)
                    if (arr[mid] == target) {
                        return mid;
                        //     arr[1]   < 23.65
                    } else if (arr[mid] < target) {
                        left = mid + 1; //5    - 4индекс
                    } else {
                        //4    = 1  - 1   = 0
                        right = mid - 1;
                    }
                }
                return -1;
            }
        }

