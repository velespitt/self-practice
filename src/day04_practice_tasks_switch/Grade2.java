package day04_practice_tasks_switch;

public class Grade2 {
    public static void main(String[] args) {
/*
 Create a class called Grade2. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				   Great job
 */
        char grade = 'A';

        switch (grade){
            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Great Job");
            case 'C' -> System.out.println("Good");
            case 'D'-> System.out.println("Passed");
            case 'F' -> System.out.println("Failed");

            default -> System.out.println("Invalid Grade");
        }
    }
}
