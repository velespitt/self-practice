package day04_practice_tasks_ifelse;

public class GradeLevel {
    public static void main(String[] args) {
        /*
        Create a class called GradeLevel. Given a number (byte) gradeLevel, determine and print which
	school type someone is in. The grade levels and types are:

		1-5: Elementary school
		6-8: Middle school
		9-12: High school
		13-16: College
		17-18: Grad School
		For any other grade level, print "Invalid grade level."

			Example:
				   gradeLevel = 8

			Output:
				  Middle school

         */

        byte gradeLevel = 18;

        if (gradeLevel >= 1 && gradeLevel <= 5) {
            System.out.println("Elementary school");
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            System.out.println("Middle school");
        } else if (gradeLevel >= 9 && gradeLevel <= 12) {
            System.out.println("High school");
        } else if (gradeLevel >= 13 && gradeLevel <= 16) {
            System.out.println("College");
        } else if (gradeLevel >= 17 && gradeLevel <= 18) {
            System.out.println("Grad school");
        } else System.out.println("Invalid Grade");
    }
}
