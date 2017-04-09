package by.parf.dao.auditorium;

import by.parf.domain.Auditorium;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Kiryl_Parfiankou on 4/9/2017.
 */
public class AuditoriumDaoImpl implements AuditoriumDao {

    private List<Auditorium> auditoriums;


    public AuditoriumDaoImpl() {
        this.auditoriums = new ArrayList<>();
    }

    @Override
    public Auditorium get(String id) {
        Optional<Auditorium> optional = auditoriums.stream()
                .filter(auditorium -> id.equals(auditorium.getId()))
                .findAny();
        return optional.get();
    }

    @Override
    public List<Auditorium> getAll() {
        return auditoriums;
    }

    @Override
    public int update(List<Auditorium> auditoriums) {
        return 0; // TODO
    }

    @Override
    public int delete(String... ids) {
        return 0; // TODO
    }

    @Override
    public int create(List<Auditorium> auditoriums) {
        this.auditoriums.addAll(auditoriums);
        return auditoriums.size();
    }
}
