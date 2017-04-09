package by.parf.dao.event;

import by.parf.domain.Event;

import java.util.List;

/**
 * Created by Kiryl_Parfiankou on 4/9/2017.
 */
public interface EventDao {

    Event get(String id);
    Event getByName(String name);
    List<Event> getAll();
    int update(Event... events);
    int delete(String... ids);
    int create(Event... events);
}
