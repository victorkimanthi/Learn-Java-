package com.company;

public class Main {

    public static void main(String[] args) {
       // VipCustomer vipCustomer=new VipCustomer("Victor","Vick@gmail.com", 20000);
        VipCustomer vipCustomer1 =new VipCustomer();
        System.out.println(vipCustomer1.getName() + " email is " + vipCustomer1.getEmail() + " and creditLimit is " + vipCustomer1.getCreditLimit());
        VipCustomer vipCustomer2=new VipCustomer("Stano","Stano@gmail.com");
        System.out.println("Credit limit of " + vipCustomer2.getCreditLimit()+ " of customer " + vipCustomer2.getName());
        VipCustomer vipCustomer=new VipCustomer("Victor","Vick@gmail.com", 20000);

    }
}
