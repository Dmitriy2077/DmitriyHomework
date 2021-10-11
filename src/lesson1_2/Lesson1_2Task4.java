package lesson1_2;

import java.util.Scanner;

/**
 * 4) Даны 3 целых числа. Найти количество положительных чисел в исходном
 * наборе.
 */

public class Lesson1_2Task4 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbersForCheck = new int[3];

        System.out.print("Enter 3 numbers:\nFirst number = ");
        numbersForCheck[0] = scanner.nextInt();
        System.out.print("Second number = ");
        numbersForCheck[1] = scanner.nextInt();
        System.out.print("Third number = ");
        numbersForCheck[2] = scanner.nextInt();

        int counterOfPositiveNumbers = 0;

        for (int i : numbersForCheck)
            if (isPositive(i)) {
                counterOfPositiveNumbers++;
            }

        System.out.println("Quantity of positive numbers = " + counterOfPositiveNumbers);
    }

    private static boolean isPositive(int sourceNumber) {
        return sourceNumber > 0;
    }
}
