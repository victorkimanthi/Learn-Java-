package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(2,1,5));
    }
    public static boolean canPack(int bigCount, int smallCount ,int goal){

        if(bigCount<0||smallCount<0||goal<0) {
            return false;
        }
        int bigCountKilos=bigCount*5;
        int smallCountKilos=smallCount*1;
        if((bigCountKilos+smallCountKilos>goal) && (bigCountKilos<goal)){
            return true;
        }else if(bigCountKilos+smallCountKilos==goal) {
            return true;
        }else {
            return false;
        }
    }
/*     if(bigCount<0||smallCount<0||goal<0) {
            return false;
        }
        int bigCountKilo = bigCount*5;
        if(bigCountKilo+smallCount*1 == goal){
            return true;
        }else if((bigCountKilo>=goal&&bigCountKilo%goal == 0)||(bigCountKilo>=goal&&goal%5<=smallCount)){
            return true;
        }else if(smallCount>=goal){
            return true;
        }else if(bigCountKilo+smallCount>goal&&goal%bigCountKilo<=smallCount){
            return true;
        }else{
            return false;
        }*/
    }




