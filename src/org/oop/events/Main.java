package org.oop.events;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Event event = new Event("", LocalDate.now(),200,0);
        int n = 0;
        boolean check = false;


        System.out.println("Inserisci il nome dell'evento");
        event.setTitle(scan.next());
        System.out.println("Quando si terrà questo evento? (yyyy-mm-dd): ");
        LocalDate eventDate = LocalDate.parse(scan.next());

        try {
            event.setDate(eventDate);
        } catch (DateTimeException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }


        while (!check){
            System.out.println("I posti disponibili sono: " + (event.getNumSeats() - event.getReservedSeats()) );
            System.out.println("Al momento ci sono: " + event.getReservedSeats() + " prenotazioni");

            System.out.println("-----------------------------------");
            System.out.println("Se vuoi prenotare un posto premi 1");
            System.out.println("Se vuoi cancellare la prenotazione di un posto premi 2");
            System.out.println("Per uscire premi 3");
            int userChoice = scan.nextInt();

            switch (userChoice){
                case 1 ->{
                    System.out.println("Quanti posti vuoi prenotare? ");
                    n = scan.nextInt();
                    if (n>0){
                        for (int i = 0; i < n; i++) {
                        event.booking();
                        }
                    }else {
                        System.out.println("Inserisci un numero maggiore di 0");
                    }
                }
                case 2 ->{
                    System.out.println("Quante prenotazioni vuoi cancellare?");
                    n = scan.nextInt();
                    if (n>0){
                        for (int i = 0; i < n; i++) {
                        event.canceling();
                        }
                        }else {
                        System.out.println("Inserisci un numero maggiore di 0");
                    }
                }
                case 3->{
                    System.out.println("exit");
                    check = true;
                }
            }
        }
            System.out.println(event);
    }
}