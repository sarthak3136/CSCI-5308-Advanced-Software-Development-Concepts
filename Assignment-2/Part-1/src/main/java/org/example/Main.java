package org.example;

import org.example.AccountTransaction.BankAccount;
import org.example.AccountTransaction.Transaction;
import org.example.Bank.Bank;
import org.example.Bank.BankBranch;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        // Account 1
        Bank bank = new Bank();

        BankBranch bankBranch1 = new BankBranch("Halifax");
        BankAccount account1 = new BankAccount("12345", 100.0, bankBranch1, "Brad", "7987987981");
        bank.addAccount(account1);

        BankBranch bankBranch2 = new BankBranch("Truro");
        BankAccount account2 = new BankAccount("67890", 200.0, bankBranch2, "Dough", "9879879852");
        bank.addAccount(account1);

        // Account Info of Bank Account1 Before Transaction
        System.out.println("Bank Account 1 Details Before Transaction");
        account1.accountInfo();
        System.out.println();

        // Account Info of Bank Account 2 Before Transaction
        System.out.println("Bank Account 2 Details Before Transaction");
        account2.accountInfo();
        System.out.println();

        // Performing Transaction
        Transaction transaction = new Transaction(1, new Date(), 50.0, bank);
        transaction.performTransaction(account1, account2);

        // Account Info of Bank Account1 Before Transaction
        System.out.println("Bank Account 1 Details After Transaction");
        account1.accountInfo();
        System.out.println();

        // Account Info of Bank Account 2 Before Transaction
        System.out.println("Bank Account 2 Details After Transaction");
        account2.accountInfo();
        System.out.println();

        bank.branchWithMostAccounts();
    }
}