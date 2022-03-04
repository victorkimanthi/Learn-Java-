package com.company;

import java.util.ArrayList;

/*public class Bank {
    private String nameOfBank;
    private ArrayList<Branch> branches;

    public Bank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
        this.branches = new ArrayList<>();
    }
    public boolean addNewBranch(String nameOfBranch){
        if(findCustomer(nameOfBranch) > 0) {
            System.out.println("Name already exists in file");
            return false;
        }
       // this.customers.add(customer) ;
        return  true;
    }
    public int findBranch(String name) {
        for(int i = 0 ; i<this.branches.size() ; i ++){
            Branch branch =this.branches.get(i);
            if(branch.equals(name)){

            }
        }
        return 0;
    }
    public int findCustomer(String name) {
        return this.branches.indexOf(name);
    }
}*/
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
public class Bank {
    private String nameOfBank;
    private ArrayList<Branch> branches;

    public Bank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
        this.branches = new ArrayList<>();
    }
    public boolean addBranch(String branchName){
        if(findBranch(branchName)==null){
          this.branches.add(new Branch(branchName));
          return  true;
        }
        return false;
    }
    public boolean addCustomer(String branchName,String customerName,double initialAmount){
        Branch branch= findBranch(branchName);
        if( branch!=null){
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName,String customerName,double amount){
        Branch branch= findBranch(branchName);
        if( branch!=null){
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }

    public Branch findBranch(String branchName){
        for(int i = 0; i < branches.size();i++){
            Branch checkedBranch=this.branches.get(i);
            if(checkedBranch.getNameOfBranch().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }
    public boolean listOfCustomers(String branchName,boolean showTransactions){
        Branch branch= findBranch(branchName);
        if( branch!=null){
            System.out.println("Customer details for " + branch.getNameOfBranch() + " branch ");
            ArrayList<Customer> branchCustomers= branch.getCustomers();
            for(int i = 0; i < branchCustomers.size(); i++){
                Customer branchCustomer=branchCustomers.get(i);
                System.out.println("Customer: " +"[" + (i + 1) + "]" + branchCustomer.getName());
                if(showTransactions){
                    System.out.println("Transactions");
                ArrayList<Double> transactions = branchCustomer.getTransactions();
                for(int j = 0; j < transactions.size(); j++){
                    System.out.println("[" + (j + 1 )+ "]" + "Amount " + transactions.get(j));
                }
                }
            }
            return true;
        }
        else return false;
    }
}
