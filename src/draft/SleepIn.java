package draft;

public class SleepIn {
    public static void main(String[] args) {
        boolean isSleeping1 = sleepIn(false, false);
        boolean isSleeping2 = sleepIn(true, false);
        boolean isSleeping3 = sleepIn(false, true);

        System.out.println("Is sleeping 1: " + isSleeping1);
        System.out.println("Is sleeping 2: " + isSleeping2);
        System.out.println("Is sleeping 3: " + isSleeping3);
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }


    }

    public int sumDouble(int a, int b) {
        int sum = a+b;
        if (a==b){
            sum=sum * 2;

        }
        return sum;
    }

}
