package by.parf.dao.eventAuditorium;

import by.parf.domain.EventAuditorium;

import java.util.List;

/**
 * Created by Kiryl_Parfiankou on 4/9/2017.
 */
public interface EventAuditoriumDao {

    EventAuditorium get(String eventId, String auditoriumId);
    List<EventAuditorium> getAll();
    int update(EventAuditorium... eventAuditoriums);
    int delete(String... ids);
    int create(EventAuditorium... eventAuditoriums);
}
