package LabExercise.lab5;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        System.out.println("Please input 10 integer.");
        int number = input.nextInt();

        int largest = number;
        counter++;

        while (counter < 10) {
            number = input.nextInt();
            largest = number > largest ? number:largest;
            counter++;
        }
        System.out.printf("the largest is %d", largest);
    }
}
