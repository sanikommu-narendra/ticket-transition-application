package org.example;

import org.example.dto.Ticket;
import org.example.dto.User;
import org.example.services.TicketService;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("u1");

        TicketService ticketService = new TicketService();

        Ticket t1 = ticketService.createTicket("first ticket", u1);
        ticketService.markDone(t1, u1);
    }
}
