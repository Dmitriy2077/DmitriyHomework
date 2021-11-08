package lesson5;

import java.util.HashMap;

/**
 * Поменять ключи и значения в Map.
 * Напишите метод, который получает на вход [Map<K, V>] и возвращает Map, где ключи и значения поменяны местами.
 * Если карта состоит из 6 пар ключ-значение, то итоговая карта должна состоять из 6 пар ключ-значение.
 */

public class Task3_SwapCollections {
    static void swap(){
        HashMap<Integer, String> input = new HashMap<>();
        HashMap<String, Integer> output = new HashMap<>();
        final int[] i = {0};

        input.put(1,"one");
        input.put(2,"one");
        input.put(3,"two");
        input.put(4,"two");
        input.put(5,"three");

        input.forEach((key, value) -> System.out.println("Int: " + key + " Str: " + value));

        input.forEach((key, value) -> {
            output.put(i[0] + "-" + value, key);
            i[0]++;
        });

        output.forEach((key, value) -> System.out.println("Str: " + key + " Int: " + value));
    }
}