package day09_practice_tasks_arrays;

import java.util.Arrays;

public class ClassMatesReversed {
    public static void main(String[] args) {

        /*
        6. Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.

   my wrong

   for (int i = classMatesReversed.length - 1; i >= 0; i--) {
            System.out.print(Arrays.toString(classMatesReversed));
        }


         */

        String[] classMatesReversed = {"Kristen", "Ben", "David", "Lily", "Andy", "Serdar", "Aaron", "Jones", "Leila", "Nuri"};

        for (int i = classMatesReversed.length - 1; i >= 0; i--) {
            System.out.print(classMatesReversed[i] + " ");
        }
    }
}
