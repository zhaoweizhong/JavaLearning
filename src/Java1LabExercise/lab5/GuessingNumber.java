package Java1LabExercise.lab5;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    private int magicNum;
    private final int range = 10;

    public GuessingNumber() {
        Random random = new Random();
        magicNum = random.nextInt(range+1);
    }

    public void guess() {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please input a integer between 0 and %d (-1 to give up): ", range);
        int inputVar = input.nextInt();

        while (inputVar != magicNum && inputVar != -1) {
            if (inputVar < 0 || inputVar > range){
                System.out.printf("Please input a integer between 0 and %d: ", range);
            } else if (inputVar > magicNum) {
                System.out.print("Please try again. The correct answer is smaller: ");
            } else if (inputVar < magicNum) {
                System.out.print("Please try again. The correct answer is bigger: ");
            }
            inputVar = input.nextInt();
        }
        if (inputVar != -1) {
            System.out.println("Congratulations!");
        }
    }
}
