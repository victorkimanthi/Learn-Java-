package com.company;

public class BankAccount {

    private String customerName;
    private String email;
    private String phoneNumber;
    private String accountNumber;
    private double accountBalance;

    //CREATING A CONSTRUCTOR  AND CALLING IT MAIN CLASS
    public BankAccount(){
        this("John", "vickiekimathi@gmail.com", "0714443500", "1234", 2000 );
        System.out.println("Empty constructor called");
    }
    public BankAccount(String customerName,String email, String phoneNumber,String accountNumber,double accountBalance) {
        System.out.println("Account constructor with parameters called");
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(customerName,email,phoneNumber,"9999", 100.55);

    }
    

    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance= accountBalance;
    }
     public String getCustomerName(){
        return this.customerName;
     }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public double getAccountBalance(){
        return this.accountBalance;
    }
    public void setDeposit(double depositAmount){
       // public void deposit(double depositAmount)
        this.accountBalance=this.accountBalance + depositAmount;
        System.out.println("Deposit of " + depositAmount+ " made.New balance is " + this.accountBalance);
    }
    public void setWithdrawal(double withdrawalAmount){
        //public void withdrawal(double withdrawalAmount)
        if(accountBalance-withdrawalAmount < 0){
            System.out.println("Insufficient funds");
        }
        else{
            this.accountBalance=getAccountBalance()-withdrawalAmount;
            System.out.println("Your new balance is " + this.accountBalance + " after withdrawal of " + withdrawalAmount);
        }
    }


}
