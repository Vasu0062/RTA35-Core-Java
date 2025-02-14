package com.learning.core.oops.encapsulation;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber,String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    //Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: "+ amount +" to the account number: " + this.accountNumber);
        } else {
            System.out.println("Deposit amount should be positive");
        }
    }
    //withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            balance -= amount;
            System.out.println("Withdrawn success for : "+ amount +" to the account number: " + this.accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

}


class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(20 ,"Krish");

        account.deposit(1000);
        account.deposit(700);

        account.withdraw(9000);
        account.withdraw(900);

        BankAccount account2 = new BankAccount(40,"Nancy");

        account2.deposit(2000);
        account2.deposit(700);

        account2.withdraw(900);
        account2.withdraw(900);

    }}
