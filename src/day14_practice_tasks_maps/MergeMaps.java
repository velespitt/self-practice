package day14_practice_tasks_maps;


/*

3. Create a class named MergeMaps and write a program that merge two given maps.
If a key is present in both maps, add their corresponding values together.

         Example:
               map1 = {'A'=10, 'B'=20}
               map2 = {'B'=30, 'C'=40}

         Output:
               {'A'=10, 'B'=50, 'C'=40}
 */

import java.util.*;

public class MergeMaps {


    public static void main(String[] args) {

        Map<Character, Integer> map1 = new LinkedHashMap<>();

        map1.put('A', 10);
        map1.put('B', 20);

        Map<Character, Integer> map2 = new LinkedHashMap<>();

        map2.put('B', 30);
        map2.put('C', 40);

        Map<Character, Integer> combinedMap = new LinkedHashMap<>();

        List<Map<Character, Integer>> mergedMap = new ArrayList<>();

        map1.forEach(combinedMap::putIfAbsent);
        //map1.forEach((key, value) -> combinedMap.putIfAbsent(key, value)); Arka planda yapilan islem.
        map2.forEach(combinedMap::putIfAbsent);

        mergedMap.add(combinedMap);

        System.out.println(mergedMap);

    }

}
