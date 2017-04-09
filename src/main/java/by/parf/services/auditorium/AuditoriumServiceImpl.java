package by.parf.services.auditorium;

import by.parf.domain.Auditorium;

import java.util.List;

/**
 * Created by Kiryl_Parfiankou on 4/7/2017.
 */
public class AuditoriumServiceImpl implements AuditoriumService {

    private final List<Auditorium> auditoriums;

    public AuditoriumServiceImpl(List<Auditorium> auditoriums) {
        this.auditoriums = auditoriums;
    }

    @Override
    public List<Auditorium> getAuditoriums() {
        return auditoriums;
    }

    @Override
    public int getSeatsNumber(Auditorium auditorium) {
        return 0;
    }

    @Override
    public int getVipSeats(Auditorium auditorium) {
        return 0;
    }
}
