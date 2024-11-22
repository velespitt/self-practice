package day07_practice_tasks_scanner_and_class;

public class EmployeeClient {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.name = "Yusuf";
        employee.age = 26;
        employee.gender = 'M';
        employee.salary = 150_000;
        employee.jobTitle = "SDET";

        employee.work();
        System.out.println(employee);
    }
}
