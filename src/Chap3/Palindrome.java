package Chap3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int num = input.nextInt();

        int digit1 = num / 100;
        int digit2 = (num % 100) / 10;
        int digit3 = (num % 100) % 10;

        String numChar = digit3 + "" + digit2 + "" + digit1;
        int numReversed = Integer.parseInt(numChar);

        if (num == numReversed){
            System.out.print(num + " is a palindrome");
        }else{
            System.out.print(num + " is not a palindrome");
        }
    }
}
