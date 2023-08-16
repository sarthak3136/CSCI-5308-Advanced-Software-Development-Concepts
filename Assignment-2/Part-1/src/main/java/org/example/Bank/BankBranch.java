package org.example.Bank;

import org.example.Bank.Bank;

public class BankBranch extends Bank {
    //Bank bank = new Bank();
    public String branchName;

    public BankBranch(String branchName){
        this.branchName = branchName;
    }

    public void addAccount() throws Exception {
        throw new Exception("Account cannot be added!");
    }


}
