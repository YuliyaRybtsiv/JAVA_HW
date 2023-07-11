package homework_7;

import java.util.Scanner;

public class Nearest10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        double first = scanner.nextDouble();

        System.out.println("Enter second number");
        double second = scanner.nextDouble();

        if (Math.abs(first - 10) > Math.abs(second - 10)){
            System.out.println(second);
        } else if (Math.abs(second - 10) > Math.abs(first - 10)) {
            System.out.println(first);
        } else System.out.println(first + " = " + second);

    }
}
