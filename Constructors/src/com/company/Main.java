package com.company;

public class Main {

    public static void main(String[] args) {
        //THIS IS AN EXAMPLE OF CONSTRUCTORS THAT HAS PARAMETERS PASSED TO IT
	BankAccount bankAccount= new BankAccount("Eddie", "eddie@gmail.com","07143900904","12345",1000 );

        BankAccount bankAccount1= new BankAccount();

        //LONGER ROUTE THAT USES SETTERS
   /* bankAccount.setCustomerName("Eddie");
    bankAccount.setEmail("eddie@gmail.com");
    bankAccount.setAccountNumber("12345");
    bankAccount.setPhoneNumber("07143900904");*/
        //bankAccount.setAccountBalance(1000);
  bankAccount.setDeposit(5000);
        System.out.println("New balance is= " + bankAccount.getAccountBalance());
   bankAccount.setWithdrawal(4000);
        System.out.println("Remaining balance is= " + bankAccount.getAccountBalance());
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getAccountBalance());
    BankAccount bankAccount2=new BankAccount("Tim","Vickie@gmail.com","33333");
        System.out.println(bankAccount1.getAccountNumber() + " name is " + bankAccount1.getCustomerName());

    }
}
