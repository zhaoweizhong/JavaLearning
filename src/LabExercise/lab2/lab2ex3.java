package LabExercise.lab2;

import java.util.Scanner;

public class lab2ex3 {
    public static void main(String[] args){
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter three numbers
        System.out.print("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int max, min, maxTemp, minTemp;

        //Compute sum
        int sum = num1 + num2 + num3;

        //Compute average
        int average = (num1 + num2 + num3)/3;

        //Compute product
        int product = num1 * num2 * num3;

        //Comparison
        if (num1 > num2){
            maxTemp = num1;
        }else{
            maxTemp = num2;
        }
        if (maxTemp > num3){
            max = maxTemp;
        }else{
            max = num3;
        }

        if (num1 < num2){
            minTemp = num1;
        }else{
            minTemp = num2;
        }
        if (minTemp < num3){
            min = minTemp;
        }else{
            min = num3;
        }

        //display results
        System.out.println("The sum for the three numbers is " + sum + " and the average is " + average + " and the product is " + product + " and the largest is " + max + " and the smallest is " + min);
    }
}