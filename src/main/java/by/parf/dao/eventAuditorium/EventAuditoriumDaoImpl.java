package by.parf.dao.eventAuditorium;

import by.parf.domain.Auditorium;
import by.parf.domain.Event;
import by.parf.domain.EventAuditorium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Kiryl_Parfiankou on 4/9/2017.
 */
public class EventAuditoriumDaoImpl implements EventAuditoriumDao {

    private List<EventAuditorium> eventAuditoriums;

    public EventAuditoriumDaoImpl() {
        eventAuditoriums = new ArrayList<>();
    }

    @Override
    public EventAuditorium get(String eventId, String auditoriumId) {

        Optional<EventAuditorium> optional = eventAuditoriums.stream()
                .filter(eventAuditorium -> {
                    Event event = eventAuditorium.getEvent();
                    Auditorium auditorium = eventAuditorium.getAuditorium();

                    if (event != null && auditorium != null) {
                        return eventId.equals(event.getId()) &&
                                auditoriumId.equals(auditorium.getId());
                    }
                    return false;
                }).findAny();

        return optional.get();
    }

    @Override
    public List<EventAuditorium> getAll() {
        return eventAuditoriums;
    }

    @Override
    public int update(EventAuditorium... eventAuditoriums) {
        return 0; // TODO
    }

    @Override
    public int delete(String... ids) {
        return 0; // TODO
    }

    @Override
    public int create(EventAuditorium... eventAuditoriums) {
        this.eventAuditoriums.addAll(Arrays.asList(eventAuditoriums));
        return eventAuditoriums.length;
    }
}
