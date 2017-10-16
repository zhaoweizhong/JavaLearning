package Java1LabExercise.lab6;

public class NarcissisticNumber {
    public static void main(String[] args){
        int i = 100;
        do {
            int digit1 = i / 100;
            int digit2 = (i % 100) / 10;
            int digit3 = (i % 100) % 10;
            int number = (int)Math.pow(digit1, 3) + (int)Math.pow(digit2, 3) + (int)Math.pow(digit3, 3);
            if (number == i){
                System.out.print(number + " ");
            }
            i++;
        }while (i < 1000);
    }
}
