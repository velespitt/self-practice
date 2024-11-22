package day02_practice_tasks_variable;

public class EmployeeInfo {

    /*
    Output:
				Employee name: Shay
				Gender: F
				Age: 24
				Employee ID: B101
				Job title: SDET
				Company name: Apple Inc
				Full time: true
				Years of work experience: 2.5 years
				Salary: $120000.0
				Married: false
     */
    public static void main(String[] args) {
        String employeeName = "Yusuf";
        int age = 30;
        char gender = 'M';
        String companyName = "Google Inc";
        String jobTitle = "SDET";
        double yearsOfExperience = 2.5;
        int salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = true;
        String employeeId = "B101";
        System.out.println();
        System.out.println("\t\tEmployee name: " + employeeName);
        System.out.println("\t\tGender: " + gender);
        System.out.println("\t\tAge: " + age);
        System.out.println("\t\tEmployee ID: " + employeeId);
        System.out.println("\t\tJob Title: " + jobTitle);
        System.out.println("\t\tCompany Name: " + companyName);
        System.out.println("\t\tFull Time: " + isFullTime);
        System.out.println("\t\tYears of work Experience: " + yearsOfExperience);
        System.out.println("\t\tSalary: " +"$" + salary + ".0");
        System.out.println("\t\tMarried: " + isMarried);


    }
}

/*
5. Create a class named EmployeeInfo and write a program with the following requirements:

	Declare the following variables:
			employeeName (String)
			age (int)
			gender (char)
			companyName (String)
			jobTitle (String)
			yearsOfExperience (double)
			salary (int)
			isFullTime (boolean)
			isMarried (boolean)
			employeeId (String)

	Display the full employee information in the following format.

			Example:
				employeeName = "Shay";
				age = 24;
				gender = 'F';
				companyName = "Apple Inc";
				jobTitle = "SDET";
				yearsOfExperience = 2.5;
				salary = 120_000;
				isFullTime = true;
				isMarried = false;
				employeeId = "B101";

			Output:
				Employee name: Shay
				Gender: F
				Age: 24
				Employee ID: B101
				Job title: SDET
				Company name: Apple Inc
				Full time: true
				Years of work experience: 2.5 years
				Salary: $120000.0
				Married: false
 */