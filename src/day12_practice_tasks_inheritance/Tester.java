package day12_practice_tasks_inheritance;

public class Tester extends Employee {


    public Tester(String name, int age) {
        super(name, age);
    }

    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing.");
    }

}
