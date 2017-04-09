package by.parf.dao.auditorium;

import by.parf.domain.Auditorium;

import java.util.List;

/**
 * Created by Kiryl_Parfiankou on 4/9/2017.
 */
public interface AuditoriumDao {

    Auditorium get(String id);
    List<Auditorium> getAll();
    int update(List<Auditorium> auditoriums);
    int delete(String... ids);
    int create(List<Auditorium> auditoriums);
}
