package by.parf.domain;

import java.time.LocalDateTime;

/**
 * Created by Kiryl_Parfiankou on 4/9/2017.
 */
public class EventAuditorium {

    private Event event;
    private Auditorium auditorium;
    private LocalDateTime dateTime;

    public EventAuditorium() {
    }

    public EventAuditorium(Event event, Auditorium auditorium, LocalDateTime dateTime) {
        this.event = event;
        this.auditorium = auditorium;
        this.dateTime = dateTime;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
