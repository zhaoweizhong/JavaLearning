package Chap6;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputNumber = input.nextLine();

        System.out.println(getNumber(inputNumber));
    }

    public static String getNumber(String inputNumber){
        int length = inputNumber.length();
        String result = "";

        for (int i = 0; i <= length - 1; i++){
            char a = inputNumber.charAt(i); // Cut one character

            // Transform start
            if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)){
                if ((a >= 65 && a <= 67) || (a >= 97 && a <= 99)){
                    result = result + "" + 2;
                }else if ((a >= 68 && a <= 70) || (a >= 100 && a <= 102)){
                    result = result + "" + 3;
                }else if ((a >= 71 && a <= 73) || (a >= 103 && a <= 105)){
                    result = result + "" + 4;
                }else if ((a >= 74 && a <= 76) || (a >= 106 && a <= 108)){
                    result = result + "" + 5;
                }else if ((a >= 77 && a <= 79) || (a >= 109 && a <= 111)){
                    result = result + "" + 6;
                }else if ((a >= 80 && a <= 83) || (a >= 112 && a <= 115)){
                    result = result + "" + 7;
                }else if ((a >= 84 && a <= 86) || (a >= 116 && a <= 118)){
                    result = result + "" + 8;
                }else if ((a >= 87 && a <= 90) || (a >= 119 && a <= 122)){
                    result = result + "" + 9;
                }
            }else{
                result = result + "" +a;
            }
        }

        return result;
    }
}
