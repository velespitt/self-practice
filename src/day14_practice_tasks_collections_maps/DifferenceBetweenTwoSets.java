package day14_practice_tasks_collections_maps;

import java.lang.reflect.Array;
import java.util.*;

public class DifferenceBetweenTwoSets {

    /*
    4. Create a class named DifferenceBetweenTwoSets and write a program that calculates the difference between two sets of integers (elements in the first set but not in the second) and displays the result.

         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}

         Output:
            {1, 5}
     */

    public static void main(String[] args) {

        ArrayList<Integer> set1 = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
        ArrayList<Integer> set2 = new ArrayList<>(Arrays.asList(2, 3, 4));

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2); // Remove elements of set2 from set1

        // Display the result
        System.out.println(difference);

    }
}
