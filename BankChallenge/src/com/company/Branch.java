package com.company;

import java.util.ArrayList;

/*public class Branch {
    private String nameOfBranch;
    private ArrayList<Customer> customers;

    public Branch(String nameOfBranch) {
        this.nameOfBranch = nameOfBranch;
        this.customers = new ArrayList<Customer>();
    }

    public String getNameOfBranch() {
        return nameOfBranch;
    }
    public boolean addNewCustomer(Customer customer){
      if(findCustomer(customer) > 0) {
          System.out.println("Name already exists in file");
          return false;
      }
       this.customers.add(customer) ;
        return  true;
    }
     public double depositTransaction(Customer customer,double depositAmount) {
        double updatedTransaction;
        if(addNewCustomer(customer)){
            return updatedTransaction=customer.getInitialTransaction() + depositAmount;
        }
        return customer.getInitialTransaction();
     }
    public double withdrawalTransaction(Customer customer,double withdrawalAmount) {
        double updatedTransaction;
        if(addNewCustomer(customer)){
            return updatedTransaction=customer.getInitialTransaction() - withdrawalAmount;
        }
        return customer.getInitialTransaction();
    }
    public int findCustomer(Customer customer) {
        return this.customers.indexOf(customer);
    }*/
public class Branch {
    private String nameOfBranch;
    private ArrayList<Customer> customers;

    public Branch(String nameOfBranch) {
        this.nameOfBranch = nameOfBranch;
        this.customers = new ArrayList<Customer>();
    }

    public String getNameOfBranch() {
        return nameOfBranch;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName)==null){
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return  false;
    }
    public boolean addCustomerTransaction(String customerName,double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer!=null){
            existingCustomer.addTransactions(amount);
            return true;
        }
        return  false;
    }
    public Customer findCustomer(String customerName){
        for(int i = 0; i < customers.size();i++){
            Customer checkedCustomer=this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }
}
