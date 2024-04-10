package org.example.dto;

import org.example.states.Analysis;
import org.example.states.State;

public class Ticket {
    private String description;
    private User createdBy;
    private State ticketState;

    public Ticket(String description, User createdBy) {
        this.description = description;
        this.createdBy = createdBy;
        this.ticketState = new Analysis(); // initial state
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

    public State getTicketState() {
        return ticketState;
    }

    public void setTicketState(State ticketState) {
        this.ticketState = ticketState;
    }
}
