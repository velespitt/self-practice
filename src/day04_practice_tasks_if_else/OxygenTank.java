package day04_practice_tasks_if_else;

public class OxygenTank {
    public static void main(String[] args) {
        /*
        2. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain
level (number), and you must print a message based on the level:

		Above 90 - Your tank is full
		Above 80 - Still okay
		Above 70 - Don't go too far
		Above 60 - Start to head back
		Above 50 - Be careful, you're at 50%

			Example:
				   oxygenLevel = 75;

			Output:
				  Don't go too far
         */
        int oxygenLevel = 490;

        if (oxygenLevel >= 90 && oxygenLevel <= 100) {

            System.out.println("Your tank is full");
        } else if (oxygenLevel >= 80 && oxygenLevel <= 89) {
            System.out.println("Still okay");
        } else if (oxygenLevel >= 70 && oxygenLevel <= 79) {
            System.out.println("Dont go too far");
        } else if (oxygenLevel >= 60 && oxygenLevel <= 69) {
            System.out.println("Start to head back");
        } else if (oxygenLevel >= 50 && oxygenLevel <= 59) {
            System.out.println("Be careful, you are at 50%");
        } else if (oxygenLevel>100) {
            System.out.println("Impossible!");
        } else System.out.println("Start pray.");
    }
}
