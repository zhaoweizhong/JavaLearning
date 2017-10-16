package Chap2;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();

        int largeAmount = (int)(amount * 100);

        // Compute dollars
        int dollar = largeAmount / 100;
        largeAmount = largeAmount % 100;

        // Compute quarter
        int quarter = largeAmount / 25;
        largeAmount = largeAmount % 25;

        // Compute dime
        int dime = largeAmount / 10;
        largeAmount = largeAmount % 10;

        // Compute nickel
        int nickel = largeAmount / 5;
        largeAmount = largeAmount % 5;

        // Compute penny
        int penny = largeAmount;

        // Display results
        System.out.println("$" + amount + " consists of:");
        System.out.println(dollar + " dollars");
        System.out.println(quarter + " quarters");
        System.out.println(dime + " dimes");
        System.out.println(nickel + " nickels");
        System.out.println(penny + " pennies");

    }
}
