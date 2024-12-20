package day12_practice_tasks_inheritance;

class Employee extends Person {

    private String employeeId;
    private String jobTitle;
    private double salary;
    private String companyName;

    public String getEmployeeId() {
        return employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee(String name, int age) {
        super(name, age);
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public void work() {
        System.out.println(jobTitle + " " + getName());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}

class EmployeeClient {
    public static void main(String[] args) {

        Person person = new Person("Ahmet", 26);
        System.out.println(person);

        Employee employee = new Employee("Yusuf",26);
        System.out.println(employee);

        employee.setEmployeeId("72");
        employee.setCompanyName("Cydeo");
        employee.setJobTitle("SDET");
        employee.setSalary(120000);
        System.out.println(employee);

        System.out.println(employee.getClass());

        Teacher teacher = new Teacher("Zack",35);

        teacher.setJobTitle("Driver");
        teacher.setSalary(100_000);
        System.out.println(teacher);
        teacher.work();

        Driver driver = new Driver("Serdar",40);
        System.out.println(driver);

        driver.work();

        Developer developer = new Developer("Yagiz",26);

        developer.setJobTitle("Dev");
        developer.setProgrammingLanguage("Flutter");
        System.out.println(developer);
        developer.work();

        Tester tester = new Tester("Yusuf",27);

        tester.setJobTitle("SDET");
        tester.work();
    }
}

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    private boolean isValidStr(String str) {
        return str != null && !str.trim().isEmpty();
    }

    private boolean isValidAge(int age) {
        return age > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isValidStr(name)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (isValidAge(age)) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
