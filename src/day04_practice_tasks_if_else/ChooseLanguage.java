package day04_practice_tasks_if_else;

public class ChooseLanguage {
    public static void main(String[] args) {

        /*
        1. Create a class named ChooseLanguage. Given an integer variable named selection that has a
number between 1~5, write a program that selects the language based on the number provided in
the selection and prints the following message:

		for 1: Hello, thank you for your call
		for 2: Hola, gracias por llamar
		for 3: Merhaba, aradığınız için teşekkürler
		for 4: Привет, спасибо за ваш звонок
		for 5: Merci, pour votre appel

			Example:
				   selection = 3;

			Output:
				  Merhaba, aradiginiz icin tesekkurler
         */
        int num = 6;
        if (num == 1) {
            System.out.println("selection = " + num + "\nHello,thanks you for your call");
        } else if (num == 2) {
            System.out.println("selection = " + num + "\nHola, gracias por llamar");
        } else if (num == 3) {
            System.out.println("selection = " + num + "\nMerhaba, aradığınız için teşekkürler");
        } else if (num == 4) {
            System.out.println("selection = " + num + "\nПривет, спасибо за ваш звонок");
        } else if (num == 5) {
            System.out.println("selection = " + num + "\nMerci, pour votre appel");
        } else System.out.println("Invalid selection");
    }
}
