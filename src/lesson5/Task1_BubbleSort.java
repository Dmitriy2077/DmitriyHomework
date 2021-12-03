package lesson5;

import java.util.Scanner;

/**
 * Создать программу, которая позволяет ввести с клавиатуры массив размером n и отсортировать его по убыванию. Т.е.:
 *     1. Нужно считать с клавиатуры значение числа "n"(размер массива), используя метод makeMassiveUsingKeybord();
 *     2.1 Ввести значения, которые будут добавлены в массив (при размере массива, равном «n», необходимо ввести элементы массива «n» раз).
 *     2.2 Далее вывести массив, который мы создали, каждый элемент через запятую и пробел, используя метод printMassive()}.
 *     3. Отсортировать базовый массив по убыванию сортировкой Пузырька, используя метод sortMassiveByBubbleWay()}.------7, 23, 12, 0, 322
 *     4. Вывести отсортированный массив, используя метод printSortedDescMassive()}.
 */

public class Task1_BubbleSort {
    static Scanner scanner = new Scanner(System.in);
    int arraySize;
    int[] array;
    int[] sortedArray;

    public Task1_BubbleSort(int arraySize) {
        this.arraySize = arraySize;
        array = new int[arraySize];
        sortedArray = new int[arraySize];
    }

    private int getArraySize() {
        return arraySize;
    }

    private int getArray(int i) {
        return array[i];
    }

    public int[] getFullArray() {
        return array;
    }

    private void setArray(int i, int val) {
        this.array[i] = val;
    }

    public int[] getFullSortedArray() {
        return sortedArray;
    }

    private void setSortedArray(int i, int val) {
        this.sortedArray[i] = val;
    }

    void makeMassiveUsingKeyboard() {
        for (int i = 0; i < getArraySize(); i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            setArray(i, scanner.nextInt());
            setSortedArray(i, getArray(i));
        }
    }

    void printMassive() {
        printArray("Unsorted Array", getFullArray());
    }

    void sortMassiveByBubbleWay(int[] arraySort) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arraySort.length - 1; i++) {
                if(arraySort[i] < arraySort[i+1]){
                    isSorted = false;

                    int tmp = arraySort[i];
                    arraySort[i] = arraySort[i+1];
                    arraySort[i+1] = tmp;
                }
            }
        }
    }

    void printSortedDescMassive() {
        printArray("Sorted Array DESC", getFullSortedArray());
    }

    private void printArray(String message, int[] array) {
        System.out.print("\n" + message + ": ");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1)
                System.out.print(array[i] + ", ");
            else
                System.out.print(array[i] + ".");
        }
    }
}