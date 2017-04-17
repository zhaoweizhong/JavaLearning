package LabExercise.lab8;

public class Rectangle {
    public static void display(int integer, char charset) {
        for (int i = 1; i <= integer * integer; i++) {
            if (i % integer == 0){
                System.out.println(charset);
            }else{
                System.out.print(charset + " ");
            }
        }
    }
    public static void display(int width, int length, char charset) {
        for (int i = 1; i <= width * length; i++) {
            if (i % width == 0){
                System.out.println(charset);
            }else{
                System.out.print(charset + " ");
            }
        }
    }
}