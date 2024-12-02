package day09_practice_tasks_arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*
        8. Create a class named ReverseArray and write a program to reverse an array of integers and return it as a new one.

			Example:
				array = {1,2,3,4,5};

			Output:
				reversedArray = {5,4,3,2,1};
         */

        int[] num = {1, 2, 3, 4, 5};

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }

    }
}
