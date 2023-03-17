package org.oop.events;

import java.text.DateFormat;

public class Event {
    private String title;
    private DateFormat date;
    private int numSeats;
    private int reservedSeats = 0;

    public String getTitle() {
        return title;
    }

    public DateFormat getDate() {
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

    public void setDate(DateFormat date) {
        this.date = date;
    }

    public Event(String title, DateFormat date, int numSeats, int reservedSeats) {
        this.title = title;
        this.date = date;
        this.numSeats = numSeats;
        this.reservedSeats = reservedSeats;
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
