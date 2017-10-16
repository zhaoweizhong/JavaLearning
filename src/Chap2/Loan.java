package Chap2;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter rate
        System.out.print("Enter annual interest rate in percentage without percent sign, e.g., 7.25: ");
        double rateAnnual = input.nextDouble();

        // Obtain rate
        double rate = rateAnnual / 1200;

        // Enter credit
        System.out.print("Enter total loan amount: ");
        double amount = input.nextDouble();

        // Enter year
        System.out.print("Enter number of years as a integer: ");
        int year = input.nextInt();

        // Compute
        double paymentMonth = amount * rate / (1 - 1 / Math.pow(1 + rate, year * 12));
        double paymentTotal = paymentMonth * year *12;

        // Display results
        System.out.println("The monthly payment is $" + (int)(paymentMonth *100) / 100.0);
        System.out.println("The total payment is $" + (int)(paymentTotal *100) / 100.0);

    }
}
