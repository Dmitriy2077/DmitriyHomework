package lesson5;

import java.util.HashMap;
import java.util.Locale;

/**Постройте частотный словарь букв русского (или английского) алфавита.
 Т.е. Сколько раз каждая бука алфавита повторяется во введенной строке.
 Alphabet.put(“A”, 0)
 А → 3
 Б → 0
 */

public class Task2_Alphabet {
    String message;
    HashMap<Character, Integer> alphabet = new HashMap<>();

    public Task2_Alphabet(String message) {
        this.message = message.toLowerCase(Locale.ROOT).replaceAll(" ", "");
    }

    void findSymbols() {
        for (int i = 0; i < message.length(); i++) {
            if (alphabet.containsKey(message.charAt(i))) {
                if (alphabet.get(message.charAt(i)) >= 0)
                    alphabet.put(message.charAt(i), alphabet.get(message.charAt(i)) + 1);
            } else
                alphabet.put(message.charAt(i), 1);
        }
        alphabet.forEach((key, value) -> System.out.println(key + " " + (char) 0x2192 + " " + value));
    }
}