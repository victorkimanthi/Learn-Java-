public class EqualSumChecker {
    public static  boolean hasEqualSum(int numOne, int numTwo, int numThree){
        if(numOne+numTwo==numThree){
            System.out.println("This is true");
            return true;
        } else{
            System.out.println("This is false");
            return false;
        }
    }
}
