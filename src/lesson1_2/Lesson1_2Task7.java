package lesson1_2;

import java.util.Scanner;

/**
 * 7) (Дополнительно) В переменную записываете количество программистов. В
 * зависимости от количества программистов необходимо вывести правильно
 * окончание. Например:
 * • 2 программиста
 * • 1 программист
 * • 10 программистов
 */

public class Lesson1_2Task7 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of programmers = ");
        int programmersNumber = scanner.nextInt();

        String baseZeroOrMany = "ов";
        String baseOne = "программист";
        String baseTwoToFour = "а";

            if (programmersNumber % 10 == 1 && programmersNumber % 100 != 11)
                System.out.println(programmersNumber + " = " + baseOne);
            else if ((programmersNumber % 10 == 2 || programmersNumber % 10 == 3 || programmersNumber % 10 == 4) &&
                    (programmersNumber % 100 != 12 && programmersNumber % 100 != 13 && programmersNumber % 100 != 14))
                System.out.println(programmersNumber + " = " + baseOne + baseTwoToFour);
            else
                System.out.println(programmersNumber + " = " + baseOne + baseZeroOrMany);
    }
}
