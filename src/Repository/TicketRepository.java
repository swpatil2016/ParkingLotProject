package Repository;

import Modules.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Long, Ticket> tickets = new HashMap<>();
    int id = 0;

    public Ticket saveTicket(Ticket ticket){
        return ticket;

    }
}
