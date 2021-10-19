package lesson1_2;

import java.util.Scanner;

/**
 * 5) Даны 3 целых числа. Найти количество положительных и отрицательных
 * чисел в исходном наборе.
 */

public class Lesson1_2Task5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] checkNumbers = new int[3];

        System.out.print("Enter 3 numbers:\nFirst number = ");
        checkNumbers[0] = scanner.nextInt();
        System.out.print("Second number = ");
        checkNumbers[1] = scanner.nextInt();
        System.out.print("Third number = ");
        checkNumbers[2] = scanner.nextInt();

        int positiveNumbers = 0,
            negativeNumbers = 0;

        for (int i : checkNumbers) {
            if (i > 0) {
                positiveNumbers++;
            }
            else if (i != 0) {
                negativeNumbers++;
            }
        }
        System.out.println("Positive numbers = " + positiveNumbers +
                "\nNegative numbers = " + negativeNumbers);
    }
}
