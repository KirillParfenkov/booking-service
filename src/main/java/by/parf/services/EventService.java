package by.parf.services;

import by.parf.domain.Auditorium;
import by.parf.domain.Event;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Kiryl_Parfiankou on 4/6/2017.
 */
public interface EventService {

    Event create(Event event);
    void remove(String id);
    Event getByName();
    List<Event> getAll();
    void assignAuditorium(Event event, Auditorium auditorium, LocalDateTime dateTime);
}
