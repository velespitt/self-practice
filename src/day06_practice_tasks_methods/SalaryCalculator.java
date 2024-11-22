package day06_practice_tasks_methods;

public class SalaryCalculator {
    /*

    2. Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
    and weekly hours (int) and returns the salary.

                Example:
                    double income = salary(45, 40);

                Output:
                    93600.0
     */
    public static double salary(double hourlyRate, int weeklyRate) {
        return hourlyRate * weeklyRate * 52;

    }

    public static void main(String[] args) {
        System.out.println(salary(45,40));

    }
}
