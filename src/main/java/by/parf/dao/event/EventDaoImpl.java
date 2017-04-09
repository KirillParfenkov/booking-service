package by.parf.dao.event;

import by.parf.domain.Event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Kiryl_Parfiankou on 4/9/2017.
 */
public class EventDaoImpl implements EventDao {

    List<Event> events;

    public EventDaoImpl() {
        this.events = new ArrayList<>();
    }

    @Override
    public Event get(String id) {
        Optional<Event> optional = events.stream()
                .filter(event -> id.equals(event.getId()))
                .findAny();
        return optional.get();
    }

    @Override
    public Event getByName(String name) {
        Optional<Event> optional = events.stream()
                .filter(event -> name.equals(event.getName()))
                .findAny();
        return optional.get();
    }

    @Override
    public List<Event> getAll() {
        return events;
    }

    @Override
    public int update(Event... events) {
        return 0;
    }

    @Override
    public int delete(String... ids) {
        return 0;
    }

    @Override
    public int create(Event... events) {
        this.events.addAll(Arrays.asList(events));
        return events.length;
    }
}
