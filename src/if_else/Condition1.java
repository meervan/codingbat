package if_else;
import java.util.Scanner;
public class Condition1 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите сумму покупки: ");
            double purchaseAmount = scanner.nextDouble();

            double discountRate;

            if (purchaseAmount >= 1000) {
                discountRate = 0.1; // 10% скидка, если сумма покупки больше или равна 1000
            } else {
                discountRate = 0; // нет скидки, если сумма покупки меньше 1000
            }

            double discount = purchaseAmount * discountRate;
            double totalAmount = purchaseAmount - discount;

            System.out.println("Сумма скидки: " + discount);
            System.out.println("Итоговая сумма после скидки: " + totalAmount);
        }
    }

    /*В этой задаче программа запрашивает у пользователя сумму покупки с помощью Scanner.
    nextDouble(). Затем, с помощью оператора if-else, программа определяет, применять ли
    скидку в зависимости от суммы покупки. Если сумма покупки больше или равна 1000, программа
    устанавливает переменную discountRate равной 0.1 (10% скидка), иначе discountRate устанавливается равной 0 (нет скидки).
    Далее программа вычисляет сумму скидки (discount) путем умножения суммы покупки
    на коэффициент скидки (discountRate), а также вычисляет итоговую сумму после скидки
    (totalAmount) путем вычитания суммы скидки из суммы покупки.
    Наконец, программа выводит сумму скидки и итоговую сумму после скидки.
    Вы можете запустить эту программу и ввести сумму покупки, например:*/

