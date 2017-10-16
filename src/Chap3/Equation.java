package Chap3;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter three numbers for the values of a, b and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if(b * b - 4 * a * c > 0){
            double r1 = (- b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            double r2 = (- b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }else if(b * b - 4 * a * c == 0){
            double r = - b / (2 * a);
            System.out.println("The equation has one root " + r);
        }else{
            System.out.println("The equation has no real roots");
        }
    }
}
