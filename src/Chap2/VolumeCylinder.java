package Chap2;

import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        final double PI = 3.14159;

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
