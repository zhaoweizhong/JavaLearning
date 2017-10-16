package Java1LabExercise.lab2;

import java.util.Scanner;

public class lab2ex7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer which consists of five digits: ");
        int num = input.nextInt();

        if(num > 99999){
            System.out.print("The number is more than five digits.");
        }else if(num < 10000){
            System.out.print("The number is less than five digits.");
        }else{
                int numTenThousand = num / 10000;
                int numTenThousandRemain = num % 10000;
                int numThousand = numTenThousandRemain / 1000;
                int numThousandRemain = numTenThousandRemain % 1000;
                int numHundred = numThousandRemain / 100;
                int numHundredRemain = numThousandRemain % 100;
                int numTen = numHundredRemain / 10;
                int numOne = numHundredRemain % 10;

                System.out.print(numTenThousand + " " + numThousand + " " + numHundred + " " + numTen + " " + numOne);
        }
    }
}
