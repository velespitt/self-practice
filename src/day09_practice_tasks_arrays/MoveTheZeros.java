package day09_practice_tasks_arrays;

import java.util.Arrays;

public class MoveTheZeros {
    public static void main(String[] args) {
        /*
        9. Create a class named MoveTheZeros and write a program that can move all the zeros to the end of the array.

			Example:
				array = {10, 0, 5, 0, 1, 0};

			Output:
				{10, 5, 1, 0, 0, 0};
         */

        int[] nums = {10, 0, 5, 0, 1, 0};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

    }
}
