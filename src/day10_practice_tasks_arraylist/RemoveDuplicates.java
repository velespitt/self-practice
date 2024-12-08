package day10_practice_tasks_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicates {
    /*
    8. Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]

     */


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Listeye eleman ekleme
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer num : list) {
            // Eğer eleman daha önce uniqueList'e eklenmemişse
            if (Collections.frequency(uniqueList, num) == 0) {
                uniqueList.add(num); // Yeni listeye ekle
            }
        }

        System.out.println("Tekrarsız Liste: " + uniqueList);
    }


}


