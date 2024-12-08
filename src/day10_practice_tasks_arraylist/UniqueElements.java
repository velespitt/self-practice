package day10_practice_tasks_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    /*
    9. Create a class called UniqueElements and write a program with the following specifications:
   9.1 Given an ArrayList, display the unique elements without using any loops.

			Example:
				list = [1, 1, 2, 3, 3, 4, 5, 5]

			output:
				[2, 4]
     */


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5));

        list.retainAll(Arrays.asList(2,4));

        System.out.println(list);

        //veya

        //num her elemani tutuyor.
        //Collections.frequency(list, num) listedeki elemanlar kac defa geciyor
        //>1 ise 1den fazla geciyorsa true olur yani removeIf calisir.

        list.removeIf(num -> Collections.frequency(list, num) > 1);

        System.out.println(list);
    }


}
