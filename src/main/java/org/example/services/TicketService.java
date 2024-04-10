package org.example.services;

import org.example.dto.Ticket;
import org.example.dto.User;
import org.example.states.Analysis;
import org.example.states.Done;
import org.example.states.Review;


public class TicketService {
    public Ticket createTicket(String description, User user) {
        return new Ticket(description, user);
    }

    public void startAnalysis(Ticket ticket, User user) {
        boolean isFeasible = ticket.getTicketState().startAnalysis(ticket, user);

        if(isFeasible) {
            ticket.setTicketState(new Analysis());
        }
    }

    public void startReview(Ticket ticket, User user) {
        boolean isFeasible = ticket.getTicketState().startReview(ticket, user);

        if(isFeasible) {
            ticket.setTicketState(new Review());
        }
    }

    public void markDone(Ticket ticket, User user) {
        boolean isFeasible = ticket.getTicketState().markDone(ticket, user);

        if(isFeasible) {
            ticket.setTicketState(new Done());
        }
    }
//    public void changeTicketState(Ticket ticket, TicketState newState, User user){
//        TicketState oldState= ticket.getTicketState();
//        if(oldState.equals(TicketState.ANALYSIS)){
//            if(newState.equals(TicketState.REVIEW)){
//                System.out.println(ticket.getDescription() + " moved from " + "analysis" + " to " + "review");
//            }
//            else if(newState.equals(TicketState.DONE)){
//                System.out.println(ticket.getDescription() + " moved from " + oldState + " to " + newState+ " congratulations!!");
//            }
//            else if(newState.equals(TicketState.ANALYSIS)){
//                System.out.println("what are you doing??");
//            }
//        }
//        else if(oldState.equals(TicketState.REVIEW)){
//            if(newState.equals(TicketState.ANALYSIS)){
//                System.out.println(ticket.getDescription() + " moved from " + "review " + " to " + "Analysis , pull up your socks");
//            }
//            else if(newState.equals(TicketState.DONE)){
//                System.out.println(ticket.getDescription() + " moved from " + oldState + " to " + newState+ " congratulations!!");
//            }
//            else if(newState.equals(TicketState.REVIEW)){
//                System.out.println("what are you doing??");
//            }
//        }
//        else if(oldState.equals(TicketState.DONE)){
//            if(newState.equals(TicketState.ANALYSIS)){
//                System.out.println(ticket.getDescription() + " moved from " + "done " + " to " + "Analysis , Whats happening??");
//            }
//            else if(newState.equals(TicketState.DONE)){
//                System.out.println(ticket.getDescription() + " is already in done state");
//            }
//            else if(newState.equals(TicketState.REVIEW)){
//                System.out.println(ticket.getDescription() + " moved from " + "done " + " to " + "Analysis , Whats happening??");
//            }
//        }
//    }
}
