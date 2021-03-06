package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        /*List<Theatre.Seat> seatsCopy = new ArrayList<>(theatre.seats);
        printList(seatsCopy);

        seatsCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        Collections.reverse(seatsCopy);
        System.out.println("Printing seatCopy");
        printList(seatsCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        Collections.shuffle(seatsCopy);
        System.out.println("Printing seatCopy");
        printList(seatsCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);


        Theatre.Seat minSeat = Collections.min(seatsCopy);
        Theatre.Seat maxSeat = Collections.max(seatsCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        sortList(seatsCopy);
        System.out.println("Printing Sorted seatsCopy");
        printList(seatsCopy);*/
        //theatre.getSeats();
        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is already reserved");
        }
        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is already reserved");
        }
        if(theatre.reserveSeat("B13")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry,seat is already reserved");
        }
        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber()+ " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("=================================================================================");
    }

   /* public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }*/
}

