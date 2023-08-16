package org.example.Bank;

import org.example.AccountTransaction.BankAccount;

import java.util.*;

public class Bank {
    public ArrayList<BankAccount> accounts = new ArrayList<>();
    public ArrayList<BankBranch> branches = new ArrayList<>();
    String name;
    int numberOfEmployees;

    public double balance;

    //BankBranch bankBranch = new BankBranch("Halifax");

    // 1) Adding Account
    public void addAccount(BankAccount bankAccount) throws Exception {
        accounts.add(bankAccount);
    }

    // 2) Getting Accounts in the Bank
    public ArrayList<BankAccount> getAccounts(){
        return accounts;
    }

    // 3) Adding Branch in the Bank
    public void addBranch(BankBranch branch){
        branches.add(branch);
    }

    // 4) Removing Branch in the Bank
    public void removeBranch(BankBranch branch){
        branches.remove(branch);
    }

    // 5) Returning Total Branches in the Bank
    public int totalBranches(){
        return branches.size();
    }

    // 6) Getting Name of the Bank
    public String getName(){
        return name;
    }

    // 7) Setting Name of the Bank
    public void setName(String name){
        this.name = name;
    }

    // 8) Getting All the Branches in the Bank
    public ArrayList<BankBranch> getBranches(){
        return branches;
    }

    // 9) Returning the director the bank.
    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    // 10) Removing Accounts from the Bank
    public void removeAccounts(BankAccount bankAccount){
        accounts.remove(bankAccount);
    }

    // 11) Retrieving the Number of Accounts in the Bank
    public int numberOfAccounts(){
        return accounts.size();
    }

    // 12) Address of the Bank
    public String addressOfTheBank(){
        return "54, Goldberg Avenue, Halifax";
    }

    // 13) Number of Employees of the Bank
    public int numberOfEmployees(){
        return 200;
    }

    // 14) Deposit in the Bank
    public void deposit(double amount) {
        balance += amount;
    }

    // 15) Withdraw from the Bank
    public void withdraw(double amount) {
        balance -= amount;
    }

    // 16) Transfer from the Bank.
    public void transfer(BankAccount receiver, double amount){
        withdraw(amount);
        receiver.deposit(amount);
    }

    // 17) Search Particular Account Number
    public BankAccount searchAccount(String accountNumber){
        for(int i=0; i<accounts.size(); i++){
            if(accounts.get(i).accountNumber.equals(accountNumber)){
                return accounts.get(i);
            }
        }
        System.out.println("No such account number!");
        return null;
    }

    // 18) Total balance in the particular branch
    public double totalAccountHoldersMoneyInBranch(String branch){
        double totalMoney = 0;
        for(int i=0; i<accounts.size(); i++){
            if(accounts.get(i).branch.equals(branch)){
                totalMoney = totalMoney + accounts.get(i).balance;
            }
        }
        return totalMoney;
    }

    // 19) Total AccountHolders in the particular branch
    public int totalAccountHolderInBranch(String branch){
        int totalAccountHolders = 0;
        for(int i=0; i<accounts.size(); i++){
            if(accounts.get(i).branch.equals(branch)){
                totalAccountHolders = totalAccountHolders + 1;
            }
        }
        return totalAccountHolders;
    }

    // 20) Branch with most number of Accounts
    public void branchWithMostAccounts(){
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();

        for(int i=0; i<accounts.size(); i++){
            if(!hm.containsKey(accounts.get(i)))
            {
                hm.put(accounts.get(i).branch.branchName, 1);
            }
            else{
                hm.put(accounts.get(i).branch.branchName, hm.get(accounts.get(i).branch.branchName)+1);
            }
        }
        int maxValueInMap = Collections.max(hm.values());
        int count = 0;
        String branchName = "";

        for(Map.Entry<String, Integer> entry: hm.entrySet()){
            if(entry.getValue() == maxValueInMap){
                count = count + 1;
                branchName = entry.getKey();

            }
        }
        LinkedHashMap<String, Integer> branchWithMostAccounts = new LinkedHashMap<>();
        if(count == 1){
            System.out.println("Branch With most Accounts is: " + branchName);
        }
        else if(count > 1){
            for(Map.Entry<String, Integer> entry: hm.entrySet()){
                if(entry.getValue() == maxValueInMap){
                    branchWithMostAccounts.put(entry.getKey(), maxValueInMap);
                }
            }
            for(Map.Entry<String, Integer> entry: branchWithMostAccounts.entrySet()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

}
