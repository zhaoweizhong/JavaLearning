package Java1LabExercise.lab6;

public class MultiplicationTable {
    public static void main(String[] args){
        int i, j;

        for(i = 0;i <= 9; i++)
        {
            for(j = 1;j <= i; j++)
            {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
