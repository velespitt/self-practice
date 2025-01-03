package day14_practice_tasks_collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
3. Create a class named CommonElements and write a program that identifies the common elements in two given sets of integers and returns a third set containing these common elements.

         Example:
            set1 = {10, 8, 11, 20, 5, 0}
            set2 = {30, 0, 20, 40, 50, 10, 60}

         Output:
            set3 = {0, 10, 20}
 */
public class CommonElements {

    public static void main(String[] args) {
        ArrayList<Integer> set1 = new ArrayList<>(Arrays.asList(10, 8, 11, 20, 5, 0));
        ArrayList<Integer> set2 = new ArrayList<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));
        ArrayList<Integer> set3 = new ArrayList<>();

        set1.retainAll(set2);
        set3.addAll(set1);

        Collections.sort(set3);

        System.out.println(set3);

    }
}
