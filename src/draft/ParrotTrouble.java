package draft;

//We have a loud talking parrot. The "hour" parameter is
// the current hour time in the range 0..23. We are in
// trouble if the parrot is talking and the hour is
// before 7 or after 20. Return true if we are in trouble.

public class ParrotTrouble {
    public static void main(String[] args) {
        boolean problem1 = parrotTrouble(true,6);
        boolean problem2 = parrotTrouble(true, 7);
        boolean problem3 = parrotTrouble(false, 20);

        System.out.println("problem1: "+ problem1);
        System.out.println("problem2: "+ problem2);
        System.out.println("problem3: "+ problem3);


    }
    public static boolean parrotTrouble(boolean talking,int hour){
        if (talking && (hour <= 7 || hour > 20)){
           return true;
        } else  {
            return false;
        }
    }
}
