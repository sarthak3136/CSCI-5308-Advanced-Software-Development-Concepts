package org.example.AccountTransaction;

import org.example.AccountTransaction.BankAccount;
import org.example.Bank.Bank;

import java.util.Date;

public class Transaction {
    private int transactionId;
    private Date transactionDate;
    private double transactionAmount;
    private Bank bank;

    public Transaction(int transactionId, Date transactionDate, double transactionAmount, Bank bank){
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
        this.bank = bank;
    }

    // This method is for the program purpose not for smell purpose.
    public void printTransactionInfo() {
        System.out.println("Transaction Id: " + transactionId);
        System.out.println("Transaction Date: " + transactionDate);
        System.out.println("Transaction Amount: " + transactionAmount);
    }

    public void performTransaction(BankAccount sender, BankAccount receiver){
        sender.transfer(receiver, transactionAmount);
    }
}
