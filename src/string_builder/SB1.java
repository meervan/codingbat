package string_builder;

public class SB1 {
    public static void main(String[] args) {

        String color = "one";
        String res1 = color.substring(1);
        System.out.println(color);

        String str1 = "one";
        String str2 = "two";
        String sum = str1.concat(str2);
        System.out.println(sum);

        StringBuilder sb1 = new StringBuilder(); // 16
        System.out.println(sb1.capacity());

        StringBuilder sb2 = new StringBuilder(5); // 5
        System.out.println(sb2.capacity());

        StringBuilder sb3 = new StringBuilder("Hello"); //16 + 5 = 21
        System.out.println(sb3.capacity());
        System.out.println("_____________");

        StringBuilder sb4 = new StringBuilder(); // 16
        System.out.println(sb4.capacity() + "empty");
//      1234567890123456
//                  123456789012345678912 - 22 + 5 = 27
        sb4.append("I can buy some flowers");
        System.out.println(sb4.capacity()+ "I can buy..."); //34

//        123456789012345678901234567 - 7
//        Salam I can buy some flowers
//                  12345
        sb4.append("white");

        sb4.append("who");
        System.out.println(sb4.capacity()+ "white / who");
        System.out.println((34+1) *2);

        // oldCapacity
    }
}
