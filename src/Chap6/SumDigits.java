package Chap6;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a integer: ");
        long n = input.nextLong();
        System.out.println("The sum of all the digits is " + sumDigits(n));
    }

    public static int sumDigits(long n){
        long sum = 0;
        do {
            sum = sum + n % 10;
            n = n / 10;
        } while (n != 0);

        return (int)sum;
    }
}
