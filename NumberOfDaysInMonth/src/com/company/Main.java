package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
        System.out.println(getDaysInMonth(2, 2020));
    }

    /*
        public static boolean isLeapYear(int year) {
            if (year <= 9999 && year >= 1) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }*/
    /*public static int getDaysInMonth(int month,int year){

    }
}*/

        // write your code here
        public static boolean isLeapYear(int year) {
            if ((year < 9999 && year > 0) && year % 4 == 0) {
                if (year % 100 != 0) {
                    return true;
                } else if (year % 400 == 0) {
                    return true;
                }
            }

            return false;
        }

        public static int getDaysInMonth(int month, int year) {
            if ((month >= 1 && month <= 12) && (year <= 9999 && year >= 1)) {
                if (isLeapYear(year)) {
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            return 31;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            return 30;
                        case 2:
                            return 29;
                    }
                } else {
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            return 31;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            return 30;
                        case 2:
                            return 28;
                    }
                }
            }
            return -1;
        }
    }


