package by.parf.dao.ticket;

import by.parf.domain.Ticket;

import java.util.List;

/**
 * Created by Kiryl_Parfiankou on 4/9/2017.
 */
public interface TicketDao {

    Ticket get(String id);
    List<Ticket> getAll();
    int update(List<Ticket> tickets);
    int delete(String... ids);
    int create(List<Ticket> tickets);

}
