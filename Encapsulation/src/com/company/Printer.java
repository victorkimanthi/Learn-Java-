package com.company;

/*
public class Printer {
    private int tonerLevel;
    private  int noOfPagesPrinted;
    private  boolean duplexPrinter;

    public Printer(int tonerLevel, int noOfPagesPrinted, boolean duplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <=100){
            this.tonerLevel=tonerLevel;
        }
        this.noOfPagesPrinted = noOfPagesPrinted;

        this.duplexPrinter = duplexPrinter;
    }
    public void fillTonerLevel(int addTonerLevel){
        if(tonerLevel < 100){
            this.tonerLevel= this.tonerLevel + addTonerLevel;
        }
    }
    public int increasePagesPrinted(int noOfPagesPrinted) {
        if(duplexPrinter){
            System.out.println("Its a duplex printer");
            this.noOfPagesPrinted = this.noOfPagesPrinted + (noOfPagesPrinted *2);
        } else {
            this.noOfPagesPrinted = this.noOfPagesPrinted + noOfPagesPrinted;
        }
        return  this.noOfPagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
*/
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >-1 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}