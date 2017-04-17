package LabExercise.lab8;

public class Display {
    public static void triangle(int integer){
        for (int i = 1; i <= integer; i++) {
            for (int a = integer; a > i; a--) {
                System.out.print(" ");
            }
            for (int a = 1; a <= 2 * i - 1; a++) {
                System.out.print(integer);
            }
            System.out.println();
        }
    }

    public static void triangle(int integer, char charset){
        for (int i = 1; i <= integer; i++) {
            for (int a = integer; a > i; a--) {
                System.out.print(" ");
            }
            for (int a = 1; a <= 2 * i - 1; a++) {
                System.out.print(charset);
            }
            System.out.println();
        }
    }
}
