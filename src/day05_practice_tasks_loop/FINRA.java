package day05_practice_tasks_loop;

public class FINRA {
    public static void main(String[] args) {
        int num;
        for (num = 1; num <= 20; num++) {
            if (num % 3 == 0 && num % 5 != 0) {
                System.out.print(" FIN ");
            } else if (num % 5 == 0 && num % 3 != 0) {
                System.out.print(" RA ");
            } else if (num % 3 == 0 && num % 5 == 0) {
                System.out.print("FINRA ");
            } else System.out.print(num + " ");
        }
    }
}
