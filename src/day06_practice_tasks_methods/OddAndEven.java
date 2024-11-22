package day06_practice_tasks_methods;

import java.sql.SQLOutput;

public class OddAndEven {
    /*
    Create a class named OddAndEven:

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true
     */
    public static void main(String[] args) {
        System.out.println(isEven(100));
        System.out.println(isOdd(100));
    }

    public static boolean isOdd(int num1) {

        return num1 % 2 == 1;
    }

    public static boolean isEven(int num2) {
        return num2 % 2 == 0;
    }
}
