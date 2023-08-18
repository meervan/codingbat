package draft;

public class TernarnuyOperator{
    public static void main(String[] args) {

  /*      if (56<23){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }*/

        String result = (56>23)? "yes":"no";
        System.out.println(result);

        boolean result2 = ("Hi".equals("Hi"))? true : false;
        System.out.println(result2);

        int result3 = (2==1) ? 2 : 1;
        System.out.println(result3);



    }
}
