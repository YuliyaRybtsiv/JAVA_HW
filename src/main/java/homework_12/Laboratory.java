package homework_12;

import java.util.Scanner;

public class Laboratory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите первую температуру");
        int temperature1 = scanner.nextInt();
        System.out.println("Укажите вторую температуру");
        int temperature2 = scanner.nextInt();
        checkDevice(temperature1, temperature2);


    }

    public static void checkDevice (int tem1, int tem2){
        System.out.println(tem1 > 100 && tem2 < 100);
    }
}


//        Представим, что у нас есть устройство, в котором две колбы.
//        Прибор работает корректно, если температура первой колбы выше 100 градусов,
//        а температура второй колбы меньше 100 градусов.
//        Вы должны написать метод, который проверяет это устройство.
//        Ваша программа должна иметь переменные temperature1 и temperature2.
//        В результате метод возвращает true или false.
