package Java1LabExercise.lab5;

public class Factorial {
    public static void main(String[] args) {
        double result = 0;
        int n = 0;

        while (!(result > 2.71828 && result < 2.71829)) {
            System.out.println(n);
            result = result + 1/(double)factorial(n);
            n++;
        }

        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int result = 1;

        for(int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }
}
