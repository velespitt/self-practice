package day04_practice_tasks_ifelse;

public class CrewAndPassenger {
    public static void main(String[] args) {
        /*
        Create a class called CrewAndPassenger. Given the total number of people on the ship,
	determine how many should be crew members and how many can be passengers.

		Total: 50 ====> 20 crew, 30 passengers
		Total: 75 ====> 25 crew, 50 passengers
		Total: 100 ====> 30 crew, 70 passengers
		Any other number of people on the ship is not valid.
		Print how many of each type there should be.

			Example:
				   number = 75

			Output:
				  25 crew, 50 passengers
         */
        int crew;
        int passenger;
        int total = 50;

        if (total == 100) {
            crew = 30;
            passenger = 50;
            System.out.println(crew + " crew, " + passenger + " passengers");
        } else if (total == 75) {
            crew = 25;
            passenger = 50;
            System.out.println(crew + " crew, " + passenger + " passengers");
        } else if (total == 50) {
            crew = 20;
            passenger = 30;
            System.out.println(crew + " crew, " + passenger + " passengers");
        }
        else System.out.println("Invalid number of people");

    }
}
