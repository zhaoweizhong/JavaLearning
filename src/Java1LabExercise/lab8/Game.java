package Java1LabExercise.lab8;

import java.util.Scanner;

public class Game {
    public static void play(){
        int gameNum = (int)(Math.random() * 3 + 1);
        switch (gameNum){
            case 1: playGame((int)(Math.random() * 9 + 1)); break;
            case 2: playGame((int)(Math.random() * 9 + 1), (int)(Math.random() * 9 + 1)); break;
            case 3: playGame((int)(Math.random() * 9 + 1), (int)(Math.random() * 9 + 1), (int)(Math.random() * 9 + 1)); break;
        }
    }
    public static void playGame(int integer) {
        int square = integer * integer;
        do {
            System.out.print("Please enter the square of the integer: ");
            Scanner input = new Scanner(System.in);
            int inputInt = input.nextInt();
            if (inputInt == square){
                break;
            }
        }while (1==1);
        System.out.println("Congratulations!");
    }
    public static void playGame(int integer1, int integer2) {
        int product = integer1 * integer2;
        do {
            System.out.print("Please enter the product of the two integers: ");
            Scanner input = new Scanner(System.in);
            int inputInt = input.nextInt();
            if (inputInt == product){
                break;
            }
        }while (1==1);
        System.out.println("Congratulations!");
    }
    public static void playGame(int integer1, int integer2, int integer3) {
        int sum = integer1 + integer2 + integer3;
        do {
            System.out.print("Please enter the sum of the three integers: ");
            Scanner input = new Scanner(System.in);
            int inputInt = input.nextInt();
            if (inputInt == sum){
                break;
            }
        }while (1==1);
        System.out.println("Congratulations!");
    }
}
