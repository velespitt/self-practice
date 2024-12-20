package day12_practice_tasks_inheritance;

public class Teacher extends Employee{
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching.");
    }
}
