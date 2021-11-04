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
        int checkNumber = scanner.nextInt();

        String numberType = "zero.";
        int numberSizeCounter = 0;
        int temporaryNumberCopy = checkNumber;

        while (temporaryNumberCopy != 0) {
            temporaryNumberCopy /= 10;
            numberSizeCounter++;
        }

        if (checkNumber > 0) {
            numberType = "positive ";
            System.out.println(checkNumber + " is " + numberType + numberSizeCounter + "-digit number.");
        }
        else if (checkNumber < 0) {
            numberType = "negative ";
            System.out.println(checkNumber + " is " + numberType + numberSizeCounter + "-digit number.");
        }
        else {
            System.out.println(checkNumber + " is " + numberType);
        }
    }
}
