
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите сумму пополнения счета: ");
        int rechargeAmount = input.nextInt();
        int bonuss;
        if (rechargeAmount >= 1000) {
            bonuss = (rechargeAmount / 100);
        } else {
            bonuss = 0;
        }
        System.out.print("Число бонесов, которое Вам начислено: " + bonuss);
        final int startAccount = 100;
        int currentAccount = startAccount + rechargeAmount + bonuss;
        // System.out.print(". Ваш текущий счет: " + CurrentAccount);
    }
}