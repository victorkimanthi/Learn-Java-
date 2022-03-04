package com.company;

public class Main {

    public static void main(String[] args) {
        int switchValue = 2;
        switch (switchValue) {
            case 1:
                System.out.println("Value was  a 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
                System.out.println("value was 3");
                break;
            default:
                System.out.println("Value is not available");
                break;
        }

        //SWITCH EXAMPLE
        char alphabets='B';
        switch (alphabets) {
            case 'A':
                System.out.println("Letter  found was A");
                break;
            case 'B':
                System.out.println("Letter found was B");
                break;
            case 'C':
                System.out.println("Letter  found was C");
                break;
            case 'D':
                System.out.println("Letter  found was D");
                break;
            case 'E':
                System.out.println("Letter found was E");
                break;
            default:
                System.out.println("Letter not found");
                break;
        }
        //THIS IS THE SAME AS THE ABOVE CODE
        /*char alphabets='B';
        switch (alphabets) {
            case 'A':
                System.out.println("Letter  found was A");
                break;
            case 'B': case 'C': case 'D':
                System.out.println(alphabets + " was found");
                break;
            default:
                System.out.println("Letter not found");
                break;
    }*/
        String month="March";
        switch (month){
            case "January":
                System.out.println("January was found");
                break;
            case "February": case "March": case "April":
                System.out.println(month + " was found");
                break;
            default:
                System.out.println("no month found");
                break;
        }
}
}