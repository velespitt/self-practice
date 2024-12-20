package day12_practice_tasks_inheritance;

public class Driver extends Employee{
    public Driver(String name, int age) {
        super(name, age);
    }

    public void work(){
        System.out.println(getName() + " is driving.");
    }
}
