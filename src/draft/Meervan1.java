package draft;

public class Meervan1 {
    public static void main(String[] args) {
        int [] nik = {8};
        System.out.println(Meervan1.sameFirstLast(nik));


        }

    public static boolean sameFirstLast(int[] nums) {
        if (nums.length >=1){
            return (nums[0] ==nums[nums.length -1]) ? true: false;

        }


     return false;
    }
}
/* Учитывая массив целых чисел, верните true, если массив имеет
длину 1 или более, а первый элемент и последний элемент равны.
 */