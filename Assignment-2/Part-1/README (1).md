
# Part 1 

Note: The code has been written by me. I have not taken it from the sources.

**Implementation Smell**

**1. Magic Number**

*Place of occurence:* 1 occurence in org.example.Bank, 3 occurence in org.example (Line 11).   
*Reason:* They occured because the values has been passed directly during the instanting the object.

**2. Long Parameter List**

*Place of Occurence:* 1 occurence in org.example.AccountTransaction .  
*Reason:* The constructor BankAccount has 5 parameters.

**3. Complex Method**  

*Place of Occurence:*  1 occurence in org.example.Bank.   
*Reason:* The method branchWithMostAccounts has the cyclic complexity of 10 and it contains too many for loops and conditional statements.   

**Design Smell**

**1. Insufficient Modularization**

*Place of Occurence:* 1 occurence in org.example.Bank.    
*Reason:* The Bank Class contains 21 public methods and has bloated interface.

**2. Cyclic Hierarchy**

*Place of Occurence:* 1 occurence in org.example.Bank.  
Reason: The Bank class depends on one of its subclasses (creating cycle in the hierarchy). The class is dependent on the following subclass: BankBranch. The Bank.java takes BankBranch as a parameters in some of its methods.

**3. Deficient Encapsulation**

*Place of Occurence:* 3 occurence in all the classes apart from Main and org.example.transaction.  
*Reason:* The variables in those classes are declared as public instead of private.


**Architecture Smell**

**1. Cyclic Dependancy**

*Place of Occurence:* 2 occurence in org.example.Bank, org.example.AccountTransaction.    
*Reason:* This two components are in cyclic dependancy with each other because the objects of each class are called in each other.




