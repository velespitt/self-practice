package day09_practice_tasks_arrays;

public class StudentGrade {

    /*
    4. Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

   2.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B
     */


    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grade = {'A', 'B', 'C'};


        for (int i = 0; i < scores.length; i++) {

            if (scores[i] == 90) {
                grade[i] = 'A';
            } else if (scores[i] == 80) {
                grade[i] = 'B';
            } else {
                grade[i] = 'C';
            }
            System.out.println(names[i] + "`s score is " + scores[i] + ", and grade is " + grade[i]);
        }
    }
}
