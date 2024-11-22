package day04_practice_tasks_ifelse;

public class MedianNumber {
    public static void main(String[] args) {
        /*
        Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number
         */


        int a = 5;
        int b = 6;
        int c = 1;

        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println(a + " is the median number");
        } else if ((b > a && b < c) || (b > c && b < a)) {
            System.out.println(b + " is the median number");
        } else {
            System.out.println(c + " is the median number");
        }
    }
}

