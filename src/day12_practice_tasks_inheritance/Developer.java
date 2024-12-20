package day12_practice_tasks_inheritance;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int age) {
        super(name, age);
    }

    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is coding in " + programmingLanguage);
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
