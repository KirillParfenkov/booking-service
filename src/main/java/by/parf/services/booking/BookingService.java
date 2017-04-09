package by.parf.services.booking;

import by.parf.domain.Event;
import by.parf.domain.Ticket;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Kiryl_Parfiankou on 4/6/2017.
 */
public interface BookingService {

    int getTicketPrice(Event event, LocalDateTime dateTime, int seats);
    void bookTicket(Ticket ticket);
    List<Ticket> getTicketsForEvent(Event event, LocalDateTime dateTime);
}
