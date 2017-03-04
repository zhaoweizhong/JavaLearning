package LabExercise.lab2;

import java.util.Scanner;

public class lab2ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 2 integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;

        System.out.print("The sum is " + sum + " and the product is " + product + " and the difference is " + difference);

        if(num2 == 0){
            System.out.print(" and there is no quotient.");
        }else{
            double quotient = (double)num1 / (double)num2;
            System.out.print(" and the quotient is " + quotient + ".");
        }
    }
}
