package lesson5;

import java.util.Scanner;

public class Lesson5_Task1_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        makeTask1();
        makeTask2();
        makeTask3();
    }

    private static void makeTask1() {
        System.out.print("Enter the size of array: -> ");
        Task1_BubbleSort task1 = new Task1_BubbleSort(scanner.nextInt());
        task1.makeMassiveUsingKeyboard();
        task1.printMassive();
        task1.sortMassiveByBubbleWay(task1.getFullSortedArray());
        task1.printSortedDescMassive();
    }

    private static void makeTask2() {
        System.out.print("Enter the message: -> ");
        Task2_Alphabet task2 = new Task2_Alphabet(scanner.nextLine());
        task2.findSymbols();
    }

    private static void makeTask3() {
        Task3_SwapCollections.swap();
    }
}