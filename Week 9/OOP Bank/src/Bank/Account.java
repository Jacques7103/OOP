package Bank;

import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<String> history = new ArrayList<String>();

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean deposit(double amt){
        if (amt > 0){
            this.balance += amt;
            System.out.println("Successfully deposited !!");
            history.add("You successfully deposited $" + amt + " !!");
            return true;
        } else {
            System.out.println("The balance to deposit should be greater than 0 !!");
            return false;
        }
    }

    public boolean withdraw(double amt){
        if (this.balance < amt){
            System.out.println("You are low on balance !!");
            return false;
        } else {
            this.balance -= amt;
            System.out.println("Successfully withdrawn !!");
            history.add("You successfully withdrawn $" + amt + " !!");
            return true;
        }
    }

    public void getHistory(){
        if (history.size() != 0){
            System.out.println("Your bank history :");
            for (int i = 0; i < history.size(); i++){
                System.out.println(history.get(i));
            }
            System.out.println();
            System.out.println("Currently your balance is $" + getBalance() + " !!");
        } else {
            System.out.println("There is no history in your account !!");
            System.out.println();
            System.out.println("Currently your balance is $" + getBalance() + " !!");
        }
    }

    public void clearHistory(){
        history.clear();
        System.out.println("Your history is cleared !!");
    }
}