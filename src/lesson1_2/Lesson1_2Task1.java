package lesson1_2;

import java.util.Scanner;

/**
 * 1) В переменную записываем число. Надо вывести на экран сколько в этом
 * числе цифр и положительное оно или отрицательное. Например, "это
 * однозначное положительное число". Достаточно будет определить, является ли
 * число однозначным, двухзначным или трехзначным и более.
 */

public class Lesson1_2Task1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number for checking: ");
        int numberForCheck = scanner.nextInt();

        String typeOfNumber = "zero.";
        int counterForNumberSize = 0;
        int temporaryCopyOfNumber = numberForCheck;

        while (temporaryCopyOfNumber != 0) {
            temporaryCopyOfNumber /= 10;
            counterForNumberSize++;
        }

        if (numberForCheck > 0) {
            typeOfNumber = "positive ";
            System.out.println(numberForCheck + " is " + typeOfNumber + counterForNumberSize + "-digit number.");
        }
        else if (numberForCheck < 0) {
            typeOfNumber = "negative ";
            System.out.println(numberForCheck + " is " + typeOfNumber + counterForNumberSize + "-digit number.");
        }
        else {
            System.out.println(numberForCheck + " is " + typeOfNumber);
        }
    }
}
