package Chap2;

import java.util.Scanner;

public class feetConvertMeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meter = feet * 0.305;

        System.out.print(feet + " feet is " + meter + " meters");
    }
}
