package Java1LabExercise.lab2;

import java.util.Scanner;

public class lab2ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        double remainder = integer % 2;

        if (remainder == 0){
            System.out.println(integer + " is even");
        }else{
            System.out.println(integer + " is odd");
        }

    }
}
