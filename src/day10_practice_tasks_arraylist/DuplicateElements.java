package day10_practice_tasks_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicateElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);

        list.addAll(list);

        System.out.println(list);

    }
}
