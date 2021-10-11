package lesson1_2;

import java.util.Scanner;

/**
 * 2) Треугольник существует только тогда, когда сумма любых двух его сторон
 * больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
 * стороны предполагаемого треугольника. Требуется сравнить длину каждого
 * отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
 * окажется больше суммы двух других, то треугольника с такими сторонами не
 * существует.
 */

public class Lesson1_2Task2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter sides sizes:\nFirst side = ");
        int firstSideSize = scanner.nextInt();
        System.out.print("Second side = ");
        int secondSideSize = scanner.nextInt();
        System.out.print("Third side = ");
        int thirdSideSize = scanner.nextInt();

        if (firstSideSize + secondSideSize > thirdSideSize &&
                firstSideSize + thirdSideSize > secondSideSize &&
                thirdSideSize + secondSideSize > firstSideSize)
            System.out.println("Triangle is exist");
        else
            System.out.println("Triangle is not exist");
    }
}
