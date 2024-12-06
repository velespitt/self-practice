package day10_practice_tasks_arraylist;

import java.util.Arrays;

public class LettersDigitsSpecialChars {
    /*
    1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";

     */

    public static void main(String[] args) {

        String str = "Wooden Spoon123!";

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)) {
                System.out.print(each);

            }
        }
        System.out.println();
        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                System.out.print(each);

            }
        }
        System.out.println();
        for (char each : str.toCharArray()) {
            if (!Character.isLetterOrDigit(each)) {
                System.out.print(each);

            }
        }


    }
}
