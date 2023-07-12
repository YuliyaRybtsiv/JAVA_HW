package homework_13;

import java.util.Scanner;

public class WithdrawMoney {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your balance");
        int cardBalance = scanner.nextInt();
        System.out.println("Для снятия всей суммы - " + cardBalance + " - с Вашего счета, при расчетных лимитах Вам потребуется " + calculateDaysWithdraw(cardBalance) + " дней");
    }
    public static int calculateDaysWithdraw(int balance) {
        int day = 0;
        while (balance > findMaxDivisor(balance)) {
            day++;
            System.out.println("День " + day + ". Вы можете снять " + findMaxDivisor(balance) + ". Ваш остаток на счету = " + (balance - findMaxDivisor(balance)));
            balance = balance - findMaxDivisor(balance);
        }
        if (balance == 1) {
            day++;
            System.out.println("День " + day + ". Вы можете снять " + findMaxDivisor(balance) + ". Ваш остаток на счету = " + (balance - findMaxDivisor(balance)));
        }
        return day;
    }
    public static int findMaxDivisor(int number) {
        int divisorsNumbers = 0;
        int j = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                divisorsNumbers++;
            }
        }
        int[] arrayDivisors = new int[divisorsNumbers];
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                arrayDivisors[j] = i;
                j++;
            }
        }
        if (arrayDivisors.length >= 2) {
            return arrayDivisors[arrayDivisors.length - 1];
        } else return 1;
    }
}


//        У вас на банковском счету N долларов.
//        Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
//        Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
//        Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
//
//
//        Ввод:  N = 21
//        Выход:  7
//        Объяснение:  N = 21
//        Снято 7, осталось = 14
//        Снято 7, осталось = 7
//        Снято 1, осталось = 6
//        Снято 3, осталось = 3
//        Снято 1, осталось = 2
//        Снято 1, Осталось = 1
//        Снято 1, осталось = 0
