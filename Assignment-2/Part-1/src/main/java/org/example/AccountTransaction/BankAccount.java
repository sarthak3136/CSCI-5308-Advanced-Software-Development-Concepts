package org.example.AccountTransaction;


import org.example.Bank.BankBranch;

public class BankAccount {
    public String accountNumber;
    public double balance;
    public BankBranch branch;
    public String accountHolder;
    public String phoneNumber;

    public BankAccount(String accountNumber, double balance, BankBranch branch, String accountHolder, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.branch = branch;
        this.accountHolder = accountHolder;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
    public void transfer(BankAccount receiver, double amount){
        withdraw(amount);
        receiver.deposit(amount);
    }

    // This method does not contribute to code smell but its is the part of program structure.
    public void accountInfo(){
        System.out.println("Bank Account Number: " + accountNumber);
        System.out.println("Bank Account Balance: " + balance);
        System.out.println("Bank Account Branch: " + branch.branchName);
        System.out.println("Bank Account Holder: " + accountHolder);
        System.out.println("Bank Account Phone Number: " + phoneNumber);
    }
}

