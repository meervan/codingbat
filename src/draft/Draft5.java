package draft;

public class Draft5 {
    public static void main(String[] args) {
        //                                         01234567890
        StringBuilder res = new StringBuilder("MacBo okPro");

        int count = 0; // 0[], 1[o], 2[o]

//           0      11
        for (int i = 0; i < res.length(); i++) {
            //А если мы напишем так как в низу написано
            // -1 то нужно ставить <= ровно включительно.
            // for (int i = 0; i <= res.length(-1); i++) {

            if (res.charAt(i) == 'o' || res.charAt(i) == 'O') {
                count++; // 2
                if (count == 2) {
                    res.deleteCharAt(i);
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
