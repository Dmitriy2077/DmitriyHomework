package lesson1_2;

import java.util.Scanner;

/**
 * 3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
 * Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
 * 10. Вывести полученное число.
 */

public class Lesson1_2Task3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int checkNumber = scanner.nextInt();

        if (checkNumber > 0)
            System.out.println(checkNumber + " + 1 = " + (checkNumber + 1));
        else if (checkNumber < 0)
            System.out.println(checkNumber + " - 2 = " + (checkNumber - 2));
        else
            System.out.println(checkNumber + " -> " + 10);
    }
}
