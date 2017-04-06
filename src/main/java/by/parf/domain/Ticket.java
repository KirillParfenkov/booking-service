package by.parf.domain;

import java.time.LocalDateTime;

/**
 * Created by Kiryl_Parfiankou on 4/6/2017.
 */
public class Ticket {

    private Event event;
    private LocalDateTime dateTime;
    private int seats;

    public Ticket() {
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
