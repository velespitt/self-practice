package day14_practice_tasks_collections;


import java.util.*;

/*

5. Create a class named Anagram and write a program that checks if two strings are anagrams of each other, considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false
 */
public class Anagram {

    public static void main(String[] args) {
        //first attempt using list yes duplicates yes index

        String str1 = "xyze";
        String str2 = "xyzd";

        Set<String> set1 = new HashSet<>(Arrays.asList(str1.split("")));
        Set<String> set2 = new HashSet<>(Arrays.asList(str2.split("")));

        boolean result = set1.equals(set2);

        System.out.println(result);

        System.out.println(set1.equals(set2) ? "Anagram." : "Not anagram.");


    }

}
