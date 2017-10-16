package Chap6;

import java.util.Scanner;

public class RandomMatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printMatrix(n);
    }

    public static void printMatrix(int n){
        for (int i = 1; i <= n * n; i++){
            int random = (int)(Math.random() * 10); // Get random number

            // Get an element of matrix
            int x;
            if (random % 2 == 0){
                x = 0;
            }else{
                x = 1;
            }

            // Print matrix
            if (i % n != 0){
                System.out.print(x + " ");
            }else{
                System.out.println(x);
            }
        }
    }
}
