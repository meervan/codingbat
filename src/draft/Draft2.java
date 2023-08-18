package draft;

class draft {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "";
        String result = conCat(str1, str2);
        System.out.println(result); // Выводит "abc"
    }

    public static String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }
}
