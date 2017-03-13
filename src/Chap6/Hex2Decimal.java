package Chap6;

import java.util.Scanner;

public class Hex2Decimal {
    /** Main Method */
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    public static int hexToDecimal(String hex){
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch){
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
