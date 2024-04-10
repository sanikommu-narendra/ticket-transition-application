package org.example.states;

import org.example.dto.Ticket;
import org.example.dto.User;

public interface State {
    boolean startAnalysis(Ticket ticket, User user);
    boolean startReview(Ticket ticket, User user);
    boolean markDone(Ticket ticket, User user);
}
