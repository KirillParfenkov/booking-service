package by.parf.services.event;

import by.parf.dao.auditorium.AuditoriumDao;
import by.parf.dao.event.EventDao;
import by.parf.dao.eventAuditorium.EventAuditoriumDao;
import by.parf.domain.Auditorium;
import by.parf.domain.Event;
import by.parf.domain.EventAuditorium;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by Kiryl_Parfiankou on 4/7/2017.
 */
public class EventServiceImpl implements EventService {

    private EventDao eventDao;
    private EventAuditoriumDao eventAuditoriumDao;

    public EventServiceImpl(@Autowired EventDao eventDao,
                            @Autowired EventAuditoriumDao eventAuditoriumDao) {

        this.eventDao = eventDao;
        this.eventAuditoriumDao = eventAuditoriumDao;
    }

    @Override
    public Event create(Event event) {

        event.setId(UUID.randomUUID().toString());
        eventDao.create(event);
        return event;
    }

    @Override
    public void remove(String id) {
        eventDao.delete(id);
    }

    @Override
    public Event getByName(String name) {
        return eventDao.getByName(name);
    }

    @Override
    public List<Event> getAll() {
        return eventDao.getAll();
    }

    @Override
    public void assignAuditorium(Event event, Auditorium auditorium, LocalDateTime dateTime) {
        eventAuditoriumDao.create(new EventAuditorium(event,
                                                 auditorium,
                                                 dateTime));
    }
}
