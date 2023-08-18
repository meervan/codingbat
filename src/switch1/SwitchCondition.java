package switch1;

public class SwitchCondition {
    public static void main(String[] args) {
        int number = 56;

        switch (number){
            default:
                System.out.println("Np season");
                break;
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Fall");
                break;
        }

        System.out.println("-----------------------");

        String season = "Spring" + "";

        switch (season){
            default:
                System.out.println("No reason");
                break;
            case "Winter":
                System.out.println(1);
                break;
            case "Spring":
                System.out.println(2);


            case "Summer":
                System.out.println(3);
                break;
            case "Fall" :
                System.out.println(4);
        }

        System.out.println("----------------------------");

        char gender = 'p';
        switch (gender){
            default:
                System.out.println("LGPT");

            case 'm':
                System.out.println("male");
                break;
            case 'f':
                System.out.println("female");

        }
    }

}
