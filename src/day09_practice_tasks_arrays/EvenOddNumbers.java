package day09_practice_tasks_arrays;

public class EvenOddNumbers {
    public static void main(String[] args) {
        /*
        3. Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.
         */


        int[] evenOdd = {1, 2, 3, 4, 5, 6, 7};
        countEvens(evenOdd);
    }

    public static void countEvens(int[] nums) {
        int countEven = 0;
        int countOdd = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                countEven++;
            } else if (n % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println("The array has " + countOdd + " numbers and " + countEven +" even numbers.");
    }


}
