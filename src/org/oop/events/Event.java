package org.oop.events;

import java.text.DateFormat;
import java.time.LocalDate;

public class Event {
    private String title;
    private LocalDate date = LocalDate.now();
    private int numSeats;
    private int reservedSeats = 0;

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Event(String title, LocalDate date, int numSeats, int reservedSeats) {
        this.title = title;
        this.date = date;
        this.numSeats = numSeats;
        this.reservedSeats = reservedSeats;
    }

    public void booking(){
        if (reservedSeats > (numSeats - reservedSeats)){
            throw new RuntimeException("Mi dispiace la tua prenotazione non puoi essere inserita," +
                    " perchè non ci sono abbastanza posti disponibili");
        }
        if (date.isBefore(LocalDate.now())){
            throw new RuntimeException("La data inserita non è valida");
        }

        reservedSeats++;
    }

    public void canceling(){
        if (reservedSeats == 0){
            throw new RuntimeException("Non ci sono prenotazioni");
        }
        if (date.isBefore(LocalDate.now())){
            throw new RuntimeException("L'evento è già passato");
        }

        reservedSeats--;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", numSeats=" + numSeats +
                ", reservedSeats=" + reservedSeats +
                '}';
    }
}
