package Chap3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if(isLeapYear == false){
            System.out.println(year + " is not a leap year.");
        }else{
            System.out.println(year + " is a leap year.");
        }
    }
}
