package day06_practice_tasks_methods;

public class DayAndMonth {

    /*
    3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days
     */
    public static void main(String[] args) {
        System.out.println(day(5));
        System.out.println(monthName(6));
        System.out.println(daysInMonth(6));
    }

    public static String daysInMonth(int dayInMonth) {
        switch (dayInMonth){
            case 1 -> {
                return "January has 31 days";
            }
            case 2 -> {
                return "February has 28 days";
            }
            case 3 -> {
                return "March has 31 days";
            }
            case 4 -> {
                return "April has 30 days";
            }
            case 5 -> {
                return "May has 31 days";
            }
            case 6 -> {
                return "June has 30 days";
            }
            case 7 -> {
                return "July has 31 days";
            }
            case 8 -> {
                return "August has 31 days";
            }
            case 9 -> {
                return "September has 30 days";
            }
            case 10 -> {
                return "October has 31 days";
            }
            case 11 -> {
                return "November has 30 days";
            }
            case 12 -> {
                return "December has 31 days";
            }
            default -> {
                return "Invalid month";
            }
        }
    }

    public static String monthName(int numOfMonth) {
        switch (numOfMonth) {
            case 1 -> {
                return "January";
            }
            case 2 -> {
                return "February";
            }
            case 3 -> {
                return "March";
            }
            case 4 -> {
                return "April";
            }
            case 5 -> {
                return "May";
            }
            case 6 -> {
                return "June";
            }
            case 7 -> {
                return "July";
            }
            case 8 -> {
                return "August";
            }
            case 9 -> {
                return "September";
            }
            case 10 -> {
                return "October";
            }
            case 11 -> {
                return "November";
            }
            case 12 -> {
                return "December";
            }
            default -> {
                return "Invalid month";
            }
        }
    }

    public static String day(int numOfDay) {
        switch (numOfDay) {
            case 1 -> {
                return "Monday";
            }
            case 2 -> {
                return "Tuesday";
            }
            case 3 -> {
                return "Wednesday";
            }
            case 4 -> {
                return "Thursday";
            }
            case 5 -> {
                return "Friday";
            }
            case 6 -> {
                return "Saturday";
            }
            case 7 -> {
                return "Sunday";
            }
            default -> {
                return "Invalid day";
            }

        }
    }
}
