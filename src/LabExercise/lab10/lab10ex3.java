package LabExercise.lab10;

import java.util.Scanner;

public class lab10ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Matix1(3x3):");
        String[] a = input.nextLine().split(" ");
        System.out.print("Enter Matix2(3x3):");
        String[] b = input.nextLine().split(" ");
        double[][] A = new double[3][3];
        double[][] B = new double[3][3];
        if (a.length == 9 && b.length == 9) {
            for (int i = 0; i < a.length; i++) {
                A[i/3][i%3] = Double.parseDouble(a[i]);
            }
            for (int i = 0; i < b.length; i++) {
                B[i/3][i%3] = Double.parseDouble(b[i]);
            }
        } else {
            A = null;
            B = null;
        }
        printMatrix(A);
        System.out.println("*");
        printMatrix(B);
        System.out.println("=");
        double[][] result = multiplyMatrix(A, B);
        if (result != null) {
            printMatrix(result);
        } else {
            System.out.println("invalid input!");
        }
        input.close();
    }

    private static double[][] multiplyMatrix(double[][] A, double[][] B) {
        if (A.length == 0 || A[0].length == 0 ||
                B.length == 0 || B[0].length == 0 ||
                A[0].length != B.length) {
            return null;
        }
        double[][] result = new double[A.length][B[0].length];
        for (int i = 0; i < B[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                for (int k = 0; k < B.length; k++) {
                    result[j][i] += A[j][k] * B[k][i];
                }
            }
        }
        return result;
    }

    private static void printMatrix(double[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%.1f ", A[i][j]);
            }
            System.out.println();
        }
    }
}
