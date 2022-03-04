package com.company;

import java.util.ArrayList;

/*
public class Customer {
    private String nameOfCustomer;
    private double initialTransaction;
    private ArrayList<Double> transactions;
    Transaction transaction=new Transaction();
    public Customer(String nameOfCustomer,double initialTransaction) {
        this.nameOfCustomer = nameOfCustomer;
        this.initialTransaction =transaction.getInitialTransaction();
        this.transactions = new ArrayList<Double>();
    }


    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public double getInitialTransaction() {
        return initialTransaction;
    }

    public static Customer createCustomer(String nameOfCustomer, double initialTransaction) {
          return  new Customer(nameOfCustomer,initialTransaction);
    }
}
*/
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
         this.transactions=new ArrayList<Double>();
         addTransactions(initialAmount);
    }
    public void addTransactions(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}