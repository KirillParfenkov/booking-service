package by.parf.services.booking;

import by.parf.domain.Event;
import by.parf.domain.Ticket;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Kiryl_Parfiankou on 4/9/2017.
 */
public class BookingServiceImpl implements BookingService {



    @Override
    public int getTicketPrice(Event event, LocalDateTime dateTime, int seats) {
        return 0;
    }

    @Override
    public void bookTicket(Ticket ticket) {

    }

    @Override
    public List<Ticket> getTicketsForEvent(Event event, LocalDateTime dateTime) {
        return null;
    }
}
