package day04_practice_tasks_switch;

public class NumberOfDays {
    public static void main(String[] args) {
/*
Create a class named NumberOfDays. An integer variable named month is given.
	Write a program to determine the number of days in a given month.

			Example:
				   month = 5

			Output:
				   31 days

			(Assume that February has 28 days)

		If the given month number is not between 1~12, then print "Invalid."

		Hints:
			Months with 31 days: 1, 3, 5, 7, 8, 10, 12
			Months with 30 days: 4, 6, 9, 11

 */
        int month = 2;

        switch (month){
            case 1 -> System.out.println("31 days");
            case 2 -> System.out.println("28 days");
            case 3 -> System.out.println("31 days");
            case 4 -> System.out.println("30 days");
            case 5 -> System.out.println("31 days");
            case 6 -> System.out.println("30 days");
            case 7 -> System.out.println("31 days");
            case 8 -> System.out.println("31 days");
            case 9 -> System.out.println("30 days");
            case 10 -> System.out.println("31 days");
            case 11 -> System.out.println("30 days");
            case 12 -> System.out.println("31 days");
            default -> System.out.println("Invalid");

        }
    }
}
