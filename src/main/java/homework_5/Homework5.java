package homework_5;

import java.util.Scanner;

public class Homework5 {
    public Homework5() {
    }

    public static void main(String[] args) {
        System.out.println("Начало работы программы");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово, содержащее четное количество букв");

        String firstWord;
        for(firstWord = scanner.nextLine(); firstWord.length() % 2 != 0; firstWord = scanner.nextLine()) {
            System.out.println("Вы ввели слово с нечетным количеством букв, будьте внимательны. Вводите снова");
        }

        System.out.println("Введите второе слово, содержащее четное количество букв");

        String secondWord;
        for(secondWord = scanner.nextLine(); secondWord.length() % 2 != 0; secondWord = scanner.nextLine()) {
            System.out.println("Вы ввели слово с нечетным количеством букв, будьте внимательны. Вводите снова");
        }

        mixWords(firstWord, secondWord);
    }

    public static void mixWords(String first, String second) {
        System.out.println("А вместе их половинки - " + first.substring(0, first.length() / 2) + second.substring(second.length() / 2));
    }
}
