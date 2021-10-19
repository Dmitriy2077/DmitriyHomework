package lesson1_2;

import java.util.Scanner;

/**
 * 4) Даны 3 целых числа. Найти количество положительных чисел в исходном
 * наборе.
 */

public class Lesson1_2Task4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] checkNumbers = new int[3];

        System.out.print("Enter 3 numbers:\nFirst number = ");
        checkNumbers[0] = scanner.nextInt();
        System.out.print("Second number = ");
        checkNumbers[1] = scanner.nextInt();
        System.out.print("Third number = ");
        checkNumbers[2] = scanner.nextInt();

        int positiveNumbersCounter = 0;

        for (int i : checkNumbers)
            if (i > 0) {
                positiveNumbersCounter++;
            }
        System.out.println("Quantity of positive numbers = " + positiveNumbersCounter);
    }
}
