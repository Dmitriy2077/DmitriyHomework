package lesson1_2;

import java.util.Scanner;

/**
 * 6) Даны 2 числа. Вывести большее из них
 */

public class Lesson1_2Task6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter 2 numbers:\nFirst number = ");
        int firstCheckNumber = scanner.nextInt();
        System.out.print("Second number = ");
        int secondCheckNumber = scanner.nextInt();

        System.out.println("Max number is " + Math.max(firstCheckNumber, secondCheckNumber));
    }
}
