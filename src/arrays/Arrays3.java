package arrays;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {


        // 1. fixed size
        // 2. same data type

        // 1.
        int [] nums = new int[2];
        nums[1] = 53;
        nums[0] = 23;
        System.out.println(Arrays.toString(nums));

        // 2.
        int nums2 [] = new int[]{34,89,23};
        System.out.println(nums2.length);
        System.out.println(Arrays.toString(nums2));
        System.out.println(nums2[2]);
        //                 nums2[3-1]
        //                 nums2[2]
        System.out.println(nums2[nums2.length-1]); // 23
        //                 nums2[1]
        System.out.println(nums2[0+1]);

        // 3.          new int[]
        int nums3 [] = {2,4,1,8,6,1,5,3,5,10,9,10,10,10};

        String listOfElements = Arrays.toString(nums3);
        System.out.println("List: " + listOfElements);

        System.out.println(Arrays.toString(nums3));
        // Arrays.sort()
        Arrays.sort(nums3);
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums3));

        //
        System.out.println(Arrays.binarySearch(nums3, 10));

        //  0  1  2  3  4  5  6              7
        // [1, 1, 2, 3, 4, 5, 5,             6, 8, 9,     10,    10, 10, 10]


        for (int i : nums3){
            System.out.print(i + " ");
        }

    }
}


