package Java1LabExercise.lab2;

import java.util.Scanner;

public class lab2ex6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius as an integer: ");
        int radius = input.nextInt();

        final float PI = (float)3.14159;

        System.out.printf("The diameter is %d and the circumference is %f and the area is %f.",2 * radius,2 * PI * radius,PI * radius * radius);
    }
}
