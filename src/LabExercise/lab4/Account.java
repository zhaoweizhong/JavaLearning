package LabExercise.lab4;

public class Account {
    private double balance;

    public Account(double initBalance){
        if(initBalance > 0.0){balance = initBalance;}
    }

    public void credit(double credit){
        balance = balance + credit;
    }

    public void debit(double debit){
        if(debit <= balance){
            balance = balance - debit;
            System.out.println("Balance: " + balance);
        }else{
            System.out.println("Debit amount exceeded account balance.");
        }
    }

    public double getBalance(){
        return balance;
    }
}
