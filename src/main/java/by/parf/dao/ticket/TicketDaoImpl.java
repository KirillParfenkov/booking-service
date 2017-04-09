package by.parf.dao.ticket;

import by.parf.domain.Ticket;

import java.util.List;
import java.util.Optional;

/**
 * Created by Kiryl_Parfiankou on 4/9/2017.
 */
public class TicketDaoImpl implements TicketDao {

    private List<Ticket> storedTickets;

    public TicketDaoImpl(List<Ticket> storedTickets) {
    }

    @Override
    public Ticket get(String id) {

        Optional<Ticket> optional =  storedTickets.stream()
                    .filter(ticket -> id.equals(ticket.getId()))
                    .findAny();

        return optional.get();
    }

    @Override
    public List<Ticket> getAll() {
        return storedTickets;
    }

    @Override
    public int update(List<Ticket> tickets) {
        return 0; // TODO implement method
    }

    @Override
    public int delete(String... ids) {
        return 0; // TODO implement method
    }

    @Override
    public int create(List<Ticket> tickets) {
        this.storedTickets.addAll(tickets);
        return tickets.size();
    }
}
