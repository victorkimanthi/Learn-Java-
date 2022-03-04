package com.company;

public class Main {

    public static void main(String[] args) {
      Bank bank= new Bank("KCB");
      if(bank.addBranch("Nairobi")) {
        System.out.println("Nairobi branch created");
      }
      bank.addBranch("Nairobi");

      bank.addCustomer("Nairobi","Victor",500);
      bank.addCustomer("Nairobi","Eddie",500);
      bank.addCustomer("Nairobi","Morris",500);

      bank.addBranch("Nakuru");
      bank.addCustomer("Nakuru","Mercy",400);

      bank.addCustomerTransaction("Nairobi","Victor",1000);
        bank.addCustomerTransaction("Nairobi","Victor",1000);
        bank.addCustomerTransaction("Nairobi","Eddie",2000);
        bank.addCustomerTransaction("Nairobi","Morris",3000);

      bank.listOfCustomers("Nairobi",true);
      bank.listOfCustomers("Nakuru",true);


      bank.addBranch("Kisumu");

      if(!bank.addCustomer("Kisumu", "Brian", 5.53)) {
        System.out.println("Error Kisumu branch does not exist");
      }


      if(!bank.addBranch("Nairobi")) {
        System.out.println("Nairobi branch already exists");
      }

      if(!bank.addCustomerTransaction("Nairobi", "Mark", 52.33)) {
        System.out.println("Customer does not exist at branch");
      }

      if(!bank.addCustomer("Nairobi", "Eddie", 12.21)) {
        System.out.println("Customer Eddie already exists");
      }
    }
}
