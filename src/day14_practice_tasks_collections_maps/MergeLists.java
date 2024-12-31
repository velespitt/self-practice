package day14_practice_tasks_collections_maps;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

/*
2. Create a class named MergeLists and write a program that merges two given lists of integers into a third list. Ensure that the third list contains no duplicate elements and maintains the original order of elements from the input lists.

         Example:
            list1 = {10, 20, 30, 40, 50, 60, 70}
            list2 = {30, 40, 50, 60, 70, 80, 90, 100}

         Output:
            list3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}

            /*

        for (String s : array1) {

            list.add(s);
        }

        for (String s : array2) {
            list.add(s);
        }



list.addAll(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));


        return list;
 */
public class MergeLists {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));

        ArrayList<Integer> list3 = new ArrayList<>();

        for (Integer i : list1) {
            list3.add(i);
        }

        for (Integer i : list2) {
            list3.add(i);
        }

        //list3.addAll(list1);
        //list3.addAll(list2);

        Collections.sort(list3);

        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>(list3);
        list3.clear();//is must
        list3.addAll(uniqueSet);

        System.out.println(list3);

    }
}
