package draft;


public class WithinRange {
    public static void main(String[] args) {
        System.out.println(nearHundred(93));  // true
        System.out.println(nearHundred(90));  // true
        System.out.println(nearHundred(89));  // false
    }

    public static boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }
}
/*В данном случае, для того чтобы возвращалось значение true,
число n должно быть либо в пределах 10 от 100
(90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100)
либо в пределах 10 от 200 (190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200).
 Число 89 не удовлетворяет ни одному из этих условий, поэтому возвращается значение false.
 */