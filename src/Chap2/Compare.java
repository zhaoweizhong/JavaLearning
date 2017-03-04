package Chap2;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter three numbers
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double max, min, maxTemp, minTemp;
        //Compute sum
        double sum = num1 + num2 + num3;

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
        System.out.println("The sum for the three numbers is " + sum + " and the maximum is " + max + " and the minimum is " + min);
    }
}
