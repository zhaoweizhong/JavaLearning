package Chap3;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        switch (year % 12){
            case 0: System.out.println(year + " is the year of monkey"); break;
            case 1: System.out.println(year + " is the year of rooster"); break;
            case 2: System.out.println(year + " is the year of dog"); break;
            case 3: System.out.println(year + " is the year of pig"); break;
            case 4: System.out.println(year + " is the year of rat"); break;
            case 5: System.out.println(year + " is the year of ox"); break;
            case 6: System.out.println(year + " is the year of tiger"); break;
            case 7: System.out.println(year + " is the year of rabbit"); break;
            case 8: System.out.println(year + " is the year of dragon"); break;
            case 9: System.out.println(year + " is the year of snake"); break;
            case 10: System.out.println(year + " is the year of horse"); break;
            case 11: System.out.println(year + " is the year of sheep"); break;
        }
    }
}
