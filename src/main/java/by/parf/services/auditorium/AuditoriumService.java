package by.parf.services.auditorium;

import by.parf.domain.Auditorium;

import java.util.List;

/**
 * Created by Kiryl_Parfiankou on 4/6/2017.
 */
public interface AuditoriumService {

    List<Auditorium> getAuditoriums();
    int getSeatsNumber(Auditorium auditorium);
    int getVipSeats(Auditorium auditorium);
}
