package Codiing777;
public class SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false)); // Output: true
        System.out.println(sleepIn(true, false));  // Output: false
        System.out.println(sleepIn(false, true));  // Output: true
    }
}