
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int RechargeAmount;
        final int StartAccount = 100;
        int CurrentAccount;
        int Bonuss;
        System.out.print("Введите сумму пополнения счета: ");
        RechargeAmount = vvod.nextInt();
        if (RechargeAmount >= 1000)
        {
            Bonuss =  ( RechargeAmount / 100);
        }
        else
        {
            Bonuss = 0;
        }
        System.out.print("Число бонесов, которое Вам начислено: " + Bonuss);

        CurrentAccount = StartAccount + RechargeAmount + Bonuss;
        // System.out.print(". Ваш текущий счет: " + CurrentAccount);
    }
}