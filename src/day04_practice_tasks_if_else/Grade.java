package day04_practice_tasks_if_else;

public class Grade {
    public static void main(String[] args) {
        /*
        Create a class called Grade. A char variable named grade is given.
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

        String result = (grade == 'A') ? "Excellent" : (grade == 'B') ? "Great Job" : (grade == 'C') ? "Good" : (grade == 'D') ? "Passed" : (grade == 'F') ? "Failed" : "Invalid Grade";

        System.out.println(result);
    }
}
