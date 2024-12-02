package day09_practice_tasks_arrays;

import java.util.Arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        /*
        2. Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
         */

        String[] classMates = {"Kristen", "Ben", "David", "Lily", "Andy", "Serdar", "Aaron", "Jones", "Leila", "Nuri"};

        for (String classMate : classMates) {
            System.out.println(classMate);
        }

    }
}
