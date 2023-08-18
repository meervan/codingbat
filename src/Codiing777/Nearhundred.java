package Codiing777;

public class Nearhundred {
    public static void main(String[] args) {
        System.out.println(nearHundred(93)); // Output: true
        System.out.println(nearHundred(90)); // Output: true
        System.out.println(nearHundred(89)); // Output: false
    }

    public static boolean nearHundred(int n) {
        // Check if n is within 10 of 100 or 200
        return (Math.abs(n - 100) <= 10) || (Math.abs(n - 200) <= 10);
    }
}
/*nearHundred(93) → true

Math.abs(93 - 100) вычислит 7.
Math.abs(93 - 200) вычислит 107.
7 <= 10 - верно.
Функция вернет true, так как хотя бы одно из условий верно.
nearHundred(90) → true

Math.abs(90 - 100) вычислит 10.
Math.abs(90 - 200) вычислит 110.
10 <= 10 - верно.
Функция вернет true, так как хотя бы одно из условий верно.
nearHundred(89) → false

Math.abs(89 - 100) вычислит 11.
Math.abs(89 - 200) вычислит 111.
11 <= 10 - ложно.
Функция вернет false, так как оба условия ложны.
nearHundred(5) → false

Math.abs(5 - 100) вычислит 95.
Math.abs(5 - 200) вычислит 195.
95 <= 10 - ложно.
Функция вернет false, так как оба условия ложны.
nearHundred(-50) → false

Math.abs(-50 - 100) вычислит 150.
Math.abs(-50 - 200) вычислит 250.
150 <= 10 - л



*/

