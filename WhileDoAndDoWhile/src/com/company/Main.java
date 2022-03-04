package com.company;

public class Main {

    public static void main(String[] args) {
    int count =1;
    while(count!=6){
        System.out.println("count is = " + count);
        count++;
    }
        System.out.println("***************************************************");
     count=1;
     //do...while loop
    do{
        System.out.println("count is = " + count);
        count++;
    }while(count!=6);

    /*int numberIsEven=2;
    int finalNumber=20;
    int evenNumbersFound=0;
    *//*while (numberIsEven<=finalNumber){
         numberIsEven++;
        if(!isEvenNumber(numberIsEven)){
            continue;
        }
        System.out.println("even numbers are " + numberIsEven);
        }
    }*/
        int numberIsEven=2;
        int finalNumber=20;
        int evenNumbersFound=0;
        while (numberIsEven<=finalNumber) {
            numberIsEven++;
            if (!isEvenNumber(numberIsEven)) {
                continue;
            }
            System.out.println("even numbers are " + numberIsEven);
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found are " + evenNumbersFound);
    }
    //even number project
    public static boolean isEvenNumber(int numberIsEven){
        if(numberIsEven%2==0){
            return true;
        }else{
            return false;
        }
    }
}
