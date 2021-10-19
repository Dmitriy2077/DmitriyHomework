package lesson1_2;

import java.util.Scanner;

/**
 * 8) (Дополнительно*) В веденном сообщении, найдите первый повторяющийся символ и выведите его.
 */

public class Lesson1_2Task8 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the message => ");
        String researchMessage = scanner.next();
        char[] messageCharacters = researchMessage.toCharArray();

        if (firstRepeating(messageCharacters) != ' ')
            System.out.println("First repeated character is " + firstRepeating(messageCharacters));
        else
            System.out.println("No repeating characters.");
    }

    static char firstRepeating(char[] inputMessage) {
        char[] messageCharacters = new char[inputMessage.length];

        for (int i = 0; i <= inputMessage.length - 1; i++) {
            char researchCharacter = inputMessage[i];

            for (int j = 0; j <= messageCharacters.length; j++) {
                if (researchCharacter == messageCharacters[j])
                    return researchCharacter;
                else if (j == messageCharacters.length - 1) {
                    messageCharacters[i] = researchCharacter;
                    break;
                }
            }
        }
        return ' ';
    }
}
