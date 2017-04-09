package by.parf.services.event;

import by.parf.dao.event.EventDao;
import by.parf.dao.event.EventDaoImpl;
import by.parf.dao.eventAuditorium.EventAuditoriumDao;
import by.parf.dao.eventAuditorium.EventAuditoriumDaoImpl;
import by.parf.domain.Event;
import by.parf.domain.EventAuditorium;
import by.parf.domain.Rating;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Kiryl_Parfiankou on 4/7/2017.
 */
public class EventServiceTest {

    @Test
    public void create() {
        EventDao eventDao = new EventDaoImpl();
        EventAuditoriumDao eventAuditoriumDao = new EventAuditoriumDaoImpl();
        EventService eventService = new EventServiceImpl(eventDao, eventAuditoriumDao);
        int basePrice = 100;
        Rating rating = Rating.MID;
        String name = "Event";


        Event event = eventService.create(new Event(name, basePrice, rating));

        assertNotNull("Failure - EventService.create() method should return event object", event);
        assertNotNull("Failure - id should not be null", event.getId());
        assertEquals("Failure - strings are not equal", basePrice, event.getBasePrice());
        assertEquals("Failure - strings are not equal", rating, event.getRating());
        assertEquals("Failure - strings are not equal", rating, event.getRating());

    }

    @Test
    public void getAll() {
        EventDao eventDao = new EventDaoImpl();
        EventAuditoriumDao eventAuditoriumDao = new EventAuditoriumDaoImpl();
        EventService eventService = new EventServiceImpl(eventDao, eventAuditoriumDao);

        List<Event> events = generateEventList();
        events.stream().forEach(event -> eventService.create(event));
        List<Event> createdEvents = eventService.getAll();

        assertEquals("Failure - array size is not equals", events.size(), createdEvents.size());

    }

    @Test
    public void remove() {
        EventDao eventDao = new EventDaoImpl();
        EventAuditoriumDao eventAuditoriumDao = new EventAuditoriumDaoImpl();
        EventService eventService = new EventServiceImpl(eventDao, eventAuditoriumDao);

        List<Event> oldEvents = generateEventList();
        oldEvents.stream().forEach(event -> eventService.create(event));

        String removeId = oldEvents.get(0).getId();
        eventService.remove(removeId);
        List<Event> newEvents = eventService.getAll();

        List<String> idList = newEvents.stream()
                                .map(Event::getId)
                                .collect(Collectors.toList());

        assertFalse("Failure - EventService contains " + removeId, idList.contains(removeId));

    }

    @Test
    public void getByName() {
        EventDao eventDao = new EventDaoImpl();
        EventAuditoriumDao eventAuditoriumDao = new EventAuditoriumDaoImpl();
        EventService eventService = new EventServiceImpl(eventDao, eventAuditoriumDao);

        List<Event> events = generateEventList();
        events.stream().forEach(event -> eventService.create(event));
        Event eventForSearch = events.get(0);

        Event foundEvent = eventService.getByName(eventForSearch.getName());
        assertNotNull("Failure - can not found Event", foundEvent);
        assertEquals("Failure - id should be the same", eventForSearch.getId(), foundEvent.getId());

    }

    @Test
    public void assignAuditorium() {
        // TODO test assignAuditorium
    }

    private List<Event> generateEventList() {

        List<Event> events = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            events.add(new Event("Event " + i, 100, Rating.MID));
        }

        return events;
    }
}