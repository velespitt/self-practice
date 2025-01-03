package day14_practice_tasks_collections;

import java.util.*;

/*
6. Create a class named RemovePalindromes and write a program that removes all palindrome strings from a given list of strings. The removal should be performed without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"}
 */
public class RemovePalindromes {

    public static void main(String[] args) {

        //Iterator needs to be used here.

        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "race car", "madam"));

        List<String> result = removePalindromes(list);
        System.out.println(result);


    }

    // Helper method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Method to remove palindromes from the list
    public static List<String> removePalindromes(List<String> list) {
        List<String> result = new ArrayList<>();

        // Iterate over the list and add only non-palindrome strings
        for (String str : list) {
            if (!isPalindrome(str)) {
                result.add(str);
            }
        }

        return result;
    }
}
