package LabExercise.lab6;

public class ValueOfPI {
    public static void main(String[] args){
        int i = 1, j = 1;
        double pi = 0;
        do {
            if (i % 2 == 0){
                pi = pi - 4.0 / j;
            }else{
                pi = pi + 4.0 / j;
            }
            i++;
            j = j + 2;
        }while (i <= 200000);
        System.out.println("Pi = " + pi);
    }
}
