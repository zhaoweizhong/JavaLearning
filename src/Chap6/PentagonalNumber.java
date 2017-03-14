package Chap6;

public class PentagonalNumber {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            if (i % 10 == 0){
                System.out.printf("%-5d\n",getPentagonalNumber(i));
            }else{
                System.out.printf("%-5d ",getPentagonalNumber(i));
            }
        }
    }

    public static int getPentagonalNumber(int n){
        int pentagonalNumber = n * (3 * n - 1) / 2;

        return pentagonalNumber;
    }
}
