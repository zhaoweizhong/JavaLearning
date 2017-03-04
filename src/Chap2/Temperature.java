package Chap2;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature degree in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheitInt = (9.0 / 5) * celsius + 32;
        double fahrenheit = (int)(fahrenheitInt * 10) / 10.0;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
