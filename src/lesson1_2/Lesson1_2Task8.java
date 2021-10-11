package lesson1_2;

import java.util.Scanner;

/**
 * 8) (Дополнительно*) В веденном сообщении, найдите первый повторяющийся символ и выведите его.
 */

public class Lesson1_2Task8 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the message => ");
        String messageForResearch = scanner.next();

        for (int i = 0; i < messageForResearch.length(); i++) {
            for (int j = i + 1; j < messageForResearch.length(); j++) {
                if (messageForResearch.charAt(i) == messageForResearch.charAt(j)) {
                    System.out.println("First repeated character is " + messageForResearch.charAt(i));
                    return;
                }
            }
        }
        System.out.println("No repeating characters.");
    }

}
