package arrays;

import java.util.ArrayList;
import java.util.Collection;

public class Arrays9 {
    public static void main(String[] args) {




        // .contains
        Collection<Integer> list2;
        list2 = null;
        System.out.println(list2.contains(88));

        // .set
        list2.isEmpty();
        System.out.println(list2);

        // .isEmpty
        System.out.println(list2.isEmpty());
        list2.add(54);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(965);
        list3.add(472);
        list3.add(54);
        System.out.println(list3);
        list3.addAll(1, list2);
        System.out.println(list3);

        list3.removeAll(list2);

        System.out.println(list3);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(100);
        nums.add(75);
        nums.add(100);
        nums.add(28);
        nums.add(14);
        nums.add(54);
        System.out.println(nums);
        nums.remove(3);
        System.out.println(nums);
        nums.addAll(list3);
        System.out.println(nums);
        nums.removeAll(list3);
        System.out.println(nums);
        nums.addAll(list2);
        System.out.println(nums);
        nums.removeAll(list2);
        System.out.println(nums);

//        for (int i = 0; i < nums.size(); i++){
//            System.out.println(nums.get(i));
//        }

        for (Integer i : nums){
            System.out.println(i);
        }
    }
}
