package day14_practice_tasks_maps;

/*
5. Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}
 */


import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        Map<Character, Integer> uniqueMap = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {//Tekrar etmeyenler
                uniqueMap.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println(uniqueMap);
    }
}
