package day10_practice_tasks_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {

    /*
    4. Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> combined = new ArrayList<>();

        combined.addAll(Arrays.asList(arr1));
        combined.addAll(Arrays.asList(arr2));

        System.out.println(combined);

        //opt 2

        ArrayList<String> combined2 = new ArrayList<>();

        int totallen = arr1.length + arr2.length; //total iteration

        for (int i = 0; i < totallen; i++) {
            if (i<arr1.length){
                combined2.add(arr1[i]);
            }else {
                combined2.add(arr2[i - arr1.length]);
            }

        }



    }
}
