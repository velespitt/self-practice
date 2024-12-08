package day10_practice_tasks_arraylist;

import java.util.ArrayList;

public class MaximumAndMinimumNumbers {
    /*
    7. Create a class called MaximumAndMinimumNumbers and write a program with the following specifications:
   7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

			Example:
				list = [1,2,3,4,5];

			output:
			    Maximum number is 5
			    Minimum number is 1
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);

        int max = list.get(0);
        int min = list.get(0);

        for (int i = 0; i < list.size(); i++) {//0dan 4e kadar calisacak
            if (list.get(i)>max){//Onemli olan condition surekli true olmasi ki asagidaki islem yapilsin.
                max = list.get(i);//her sayi ilk degerden buyuk olacagi icin max hep artacak.
            }
            if (list.get(i)<min){
                min = list.get(i);
            }
        }
        System.out.println(max);
        System.out.println(min);



    }
}
