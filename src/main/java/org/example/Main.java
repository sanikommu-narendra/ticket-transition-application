package org.example;

import org.example.dto.Ticket;
import org.example.dto.User;
import org.example.enums.TicketState;
import org.example.services.TicketService;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("u1");

        TicketService ticketService = new TicketService();

        Ticket t1 = ticketService.createTicket("first ticket", u1);
        ticketService.changeTicketState(t1, TicketState.REVIEW, u1);
    }
}
