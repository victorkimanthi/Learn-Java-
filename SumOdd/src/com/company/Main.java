package com.company;

public class Main {

    public static void main(String[] args) {
      sumOdd(-1,11);
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            } else return false;
        } else return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start < 0 || end < start) {
            return -1;
        }
            for (int i = start; i<= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
        }

}
