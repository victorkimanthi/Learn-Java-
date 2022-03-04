package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.firstName = lastName;
    }

    public int setAge(int age) {
        if (age < 0 || age > 100) {
            return this.age = 0;
        }
        return this.age = age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else return false;
    }

     public String getFullName(){
        String fullName="";
        if((this.firstName==null || this.firstName.isEmpty()) && (this.lastName==null || this.lastName.isEmpty())){
            fullName = "";
        }else if (this.firstName==null || this.firstName.isEmpty()){
            fullName  = this.getLastName();
        } else if(this.lastName==null || this.lastName.isEmpty()){
            fullName  = this.getFirstName();
        } else {
            fullName  = ("" +this.getFirstName()+ " " +this.getLastName());
        }
//        System.out.println(result);
        return fullName ;
    }
}

/*
package com.company;
public class Person {
    // write your code here
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if(age < 0 || age > 100){
            this.age = 0;
        }else{
            this.age = age;
        }
    }
    public boolean isTeen(){
        return this.age > 12 && this.age < 20;
    }

    public String getFullName(){
        String fullName="";
        if((this.firstName==null || this.firstName.isEmpty()) && (this.lastName==null || this.lastName.isEmpty())){
            fullName = "";
        }else if (this.firstName==null || this.firstName.isEmpty()){
            fullName  = this.getLastName();
        } else if(this.lastName==null || this.lastName.isEmpty()){
            fullName  = this.getFirstName();
        } else {
            fullName  = ("" +this.getFirstName()+ " " +this.getLastName());
        }
//        System.out.println(result);
        return fullName ;
    }
}
*/
