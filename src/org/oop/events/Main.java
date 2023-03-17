package org.oop.events;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Event event = new Event("", LocalDate.now(),2,0);

        boolean check = false;

        System.out.println("ecco il numero di posti disponibili: " + event.getNumSeats());
        System.out.println("Inserisci il nome dell'evento");
        event.setTitle(scan.next());



        while (!check){

            System.out.println("Se vuoi prenotare un posto premi 1");
            System.out.println("Se vuoi cancellare la prenotazione di un posto premi 2");
            System.out.println("Per uscire premi 3");
            int userChoice = scan.nextInt();

            switch (userChoice){
                case 1 ->{
                    event.booking();
                    System.out.println("il tuo posto è stato prenotato");
                    System.out.println("Rimangono " + (event.getNumSeats() - event.getReservedSeats()) + " posti");
                }
                case 2 ->{
                    event.canceling();
                    System.out.println("Hai cancellato la prenotazione");
                    System.out.println("I posti disponibili sono: " + (event.getNumSeats() - event.getReservedSeats() + " posti"));
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