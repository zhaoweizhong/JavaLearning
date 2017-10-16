package Chap3;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int y0 = input.nextInt();
        System.out.print("Enter month: ");
        int m0 = input.nextInt();
        System.out.print("Enter the day of the month: ");
        int q = input.nextInt();
        int m;
        int y;

        switch (m0){
            case 1: m = 13; y = y0 - 1; break;
            case 2: m = 14; y = y0 - 1; break;
            default: m = m0; y = y0; break;
        }

        int j = Math.abs(y / 100);
        int k = y % 100;

        int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        switch (h){
            case 0: System.out.println("Day of the week is Saturday"); break;
            case 1: System.out.println("Day of the week is Sunday"); break;
            case 2: System.out.println("Day of the week is Monday"); break;
            case 3: System.out.println("Day of the week is Tuesday"); break;
            case 4: System.out.println("Day of the week is Wednesday"); break;
            case 5: System.out.println("Day of the week is Thursday"); break;
            case 6: System.out.println("Day of the week is Friday"); break;
        }
    }
}
