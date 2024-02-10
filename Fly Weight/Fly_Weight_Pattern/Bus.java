package Fly_Weight_Pattern;
import java.util.*;

public class Bus {
    public List<Ticket> tickets = new ArrayList<>();
    String customer_name;

    public void getTicket(String customer_name, String ticketCategory, float price) {
        this.customer_name = customer_name;
        type type = Factory.gettype(ticketCategory, price);
        Ticket ticket = new Ticket(customer_name, type);
        tickets.add(ticket);
    }

    public void printTickets() {
        for (Ticket ticket : tickets) {
            ticket.printTicket(customer_name);
        }
    }
}