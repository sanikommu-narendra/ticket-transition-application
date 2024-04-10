package org.example.dto;

import org.example.enums.TicketState;

public class Ticket {
    private String description;
    private User createdBy;
    private TicketState ticketState;

    public Ticket(String description, User createdBy) {
        this.description = description;
        this.createdBy = createdBy;
        this.ticketState = TicketState.ANALYSIS; // initial state
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public TicketState getTicketState() {
        return ticketState;
    }

    public void setTicketState(TicketState ticketState) {
        this.ticketState = ticketState;
    }
}
