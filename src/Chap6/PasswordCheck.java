package Chap6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (passwordCheck(password)){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }
    }

    public static boolean passwordCheck(String password){
        boolean passwordCheckResult;
        if (password.length() < 8){
            passwordCheckResult = false;
        }else {
            passwordCheckResult = password.matches("\\w*\\d+\\w*\\d+\\w*");
        }

        return passwordCheckResult;
    }
}
