package lesson1_2;

import java.util.Scanner;

/**
 * 5) Даны 3 целых числа. Найти количество положительных и отрицательных
 * чисел в исходном наборе.
 */

public class Lesson1_2Task5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbersForCheck = new int[3];

        System.out.print("Enter 3 numbers:\nFirst number = ");
        numbersForCheck[0] = scanner.nextInt();
        System.out.print("Second number = ");
        numbersForCheck[1] = scanner.nextInt();
        System.out.print("Third number = ");
        numbersForCheck[2] = scanner.nextInt();

        int positiveNumbers = 0,
            negativeNumbers = 0;

        for (int i : numbersForCheck) {
            if (isPositive(i)) {
                positiveNumbers++;
            }
            else if (isNegative(i)) {
                negativeNumbers++;
            }
        }

        System.out.println("Positive numbers = " + positiveNumbers +
                "\nNegative numbers = " + negativeNumbers);
    }

    private static boolean isPositive(int sourceNumber) {
        return sourceNumber > 0;
    }

    private static boolean isNegative(int sourceNumber) {
        return sourceNumber < 0;
    }
}
