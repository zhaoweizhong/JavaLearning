package Chap6;

public class SeriesSum {
    public static void main(String[] args){
        System.out.println("i        m(i)");
        for (int a = 1; a <= 20; a++){
            System.out.printf("%-9d%f\n",a,seriesSum(a));
        }
    }

    public static double seriesSum(int i){
        double sum = 0;
        for (double n = 1; n <= i; n++){
            sum = sum + n / (n + 1);
        }

        return sum;
    }
}
