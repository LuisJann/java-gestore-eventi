package org.oop.events;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concert extends Event{
    private LocalTime hour;
    private BigDecimal price;


    DecimalFormat df = new DecimalFormat("##0.00€");
    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void dateTime(){
        System.out.println(getDate() + " " + hour);
    }

    public Concert(String title, LocalDate date, int numSeats, int reservedSeats, LocalTime hour, BigDecimal price) {
        super(title, date, numSeats, reservedSeats);
        this.hour = LocalTime.now();
        this.price = price;
    }

    @Override
    public String toString() {
        return "Concert{" + getTitle() + ", Data e ora " + getDate() + " " +
                  hour +
                ", price=" + price +
                '}';
    }
}
