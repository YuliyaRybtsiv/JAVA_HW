package homework_2;

import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);        System.out.print("Введите 3-значное число: ");
        int num = scanner.nextInt();
        System.out.println("Первая цифра - " + num / 100);
        System.out.println("Средняя цифра - " + num / 10 % 10);        System.out.println("Последняя цифра - " + num % 10);
    }
}
