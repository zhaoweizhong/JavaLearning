package Java1LabExercise.lab2;

public class lab2ex8 {
    public static void main(String[] args){
        System.out.println("number  square  cube");
        int i = 0;
        do{
            System.out.printf("%-6d  %-6d  %-4d\n",i,i * i,i * i * i);
            i++;
        }while(i < 11);
    }
}
