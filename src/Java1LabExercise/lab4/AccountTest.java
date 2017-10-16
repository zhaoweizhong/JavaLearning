package Java1LabExercise.lab4;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double balance = 10000.0;

        System.out.print("Enter debit: ");
        double debit = input.nextDouble();
        Account account = new Account(balance);
        account.debit(debit);
    }
}
