package day09_practice_tasks_arrays;

public class ArrayElements {

    /*
    1. Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
     */


    public static void main(String[] args) {

        int[] nums = new int[100];

        // Diziye 1'den 100'e kadar olan sayıları atama
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1; // 100e kadar kapsamaz += yaparsak.
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        for (int i = nums.length -1; i >=0; i--) {
            System.out.print(nums[i] + " ");
        }

    }


}
