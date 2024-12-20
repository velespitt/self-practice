package day12_practice_tasks_inheritance;

public class PhoneClient {
    public static void main(String[] args) {
        iPhone iPhone = new iPhone("iPhone","15 PRO MAX","6 inches",7000,"Grey");

        System.out.println(iPhone);

        iPhone.faceTime(5332304296L);
        iPhone.setPrice(8500);
        System.out.println(iPhone);

        Samsung samsung = new Samsung("S25","6.5 inches",6500,"Black");

        System.out.println(samsung);

        samsung.developMode();

        Nokia nokia = new Nokia("3310","3 inches",100,"White");

        nokia.call(533230429);
        nokia.toString();
        nokia.text(533230429);
        System.out.println(nokia);
    }
}
