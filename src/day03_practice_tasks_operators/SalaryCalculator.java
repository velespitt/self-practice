package day03_practice_tasks_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;

        double salaryBeforeTax = hourlyRate * (weeklyHours * 52);
        double stateTax = salaryBeforeTax * (stateTaxRate/100);
        double federalTax = salaryBeforeTax * (federalTaxRate/100);
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("salaryAfterTax = " + salaryBeforeTax);
        System.out.println(federalTax);
        System.out.println(stateTax);
        System.out.println(totalTax);
        System.out.println(salaryAfterTax);

    }
}
