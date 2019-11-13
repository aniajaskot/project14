package zad1;

import java.util.Scanner;

public class AutoboxingTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj liczby");
        String a = input.nextLine();
        String b = input.nextLine();

        Integer num1 = Integer.valueOf(a);
        Integer num2 = Integer.valueOf(b);

        int number1 = num1.intValue();
        int number2 = num2.intValue();

        System.out.println(number1 + number2);
    }
}
