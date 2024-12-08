package day10_practice_tasks_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SameFirstAndLast {
    /*
    11.1 Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.

			Example:
				list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

			output:
				["Canada", "Lan", "Ebrahim", "Farida"]
     */


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        //charat kullanamadik cunku equalsignore case calismiyor. charat kullanirsak == gerekir ama caseignoreu lazim oldugu icin yine calismaz.
        list.removeIf(p -> p.substring(0,1).equalsIgnoreCase(p.substring(p.length()-1)));
        System.out.println(list);

        list.removeIf(each -> each.substring(0,each.length()-1).equals(each.substring(each.length()-1)));
        System.out.println(list);

    }
}
