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
        int numberOfProgrammers = scanner.nextInt();

        String baseZeroOrMany = "ов";
        String baseOne = "программист";
        String baseTwoToFour = "а";

            if (numberOfProgrammers % 10 == 1 && numberOfProgrammers % 100 != 11)
                System.out.println(numberOfProgrammers + " = " + baseOne);
            else if ((numberOfProgrammers % 10 == 2 || numberOfProgrammers % 10 == 3 || numberOfProgrammers % 10 == 4) &&
                    (numberOfProgrammers % 100 != 12 && numberOfProgrammers % 100 != 13 && numberOfProgrammers % 100 != 14))
                System.out.println(numberOfProgrammers + " = " + baseOne + baseTwoToFour);
            else
                System.out.println(numberOfProgrammers + " = " + baseOne + baseZeroOrMany);
    }
}
