public class TeenNumberChecker {
    public  static boolean hasTeen(int firstValue,int secondValue, int thirdValue){
        if((firstValue >= 13 && firstValue <=19)||(secondValue>= 13 && secondValue <=19)||(thirdValue>= 13 && thirdValue <=19)){
            System.out.println("This is true");
            return true;
        }else{
            System.out.println("This is false");
            return false;
        }
    }
    public static boolean isTeen(int myNumber){
        if(myNumber >= 13 && myNumber <=19){
            System.out.println("This is true");
            return true;
        }else{
            System.out.println("This is false");
            return false;
        }
    }
}
