package day14_practice_tasks_maps;

/*
2. Create a class named InvertMap and write a program that returns a new map which is the
inverted version of the provided map, meaning the keys become values and the values become keys.
It is assumed that there are no duplicate values in the original map.

         Example:
               map = {1="a", 2="b", 3="c"}

         Output:
               {"a"=1, "b"=2, "c"=3}


 */

import java.util.LinkedHashMap;
import java.util.Map;

public class InvertMap {

    public static void main(String[] args) {

        //replace method needs to be used replace(key, value)

        Map<Integer, String> normalMap = new LinkedHashMap<>();

        normalMap.put(1, "a");
        normalMap.put(2, "b");
        normalMap.put(3, "c");

        Map<String, Integer> reverseMap = new LinkedHashMap<>();

        // doesnt work like that we need to iterate reverseMap.replaceAll((k, v) -> reverseMap.put(v, k));

        for (Map.Entry<Integer, String> entry : normalMap.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println(reverseMap);

    }

}
