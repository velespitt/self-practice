package day11_practice_tasks_class_and_objects;


class EmployeeClientTry {
    public static void main(String[] args) {

        Employee employee = new Employee("Yusuf", 26, 'E', "SDET", 150_000);
        System.out.println(employee);

        Employee employee1 = new Employee("Yusuf","SDET");
        System.out.println(employee1);
    }
}

public class Employee {

    /*


3. Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.
     */

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name, int age, char gender, String jobTitle, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(String name, String jobTitle){
        this.jobTitle = jobTitle;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}'+ " " + jobTitle + " " + name + " is working";
    }
}
