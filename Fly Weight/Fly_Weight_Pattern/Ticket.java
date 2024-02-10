package Fly_Weight_Pattern;

public class Ticket {
    String customer_name;
    type type;

    public Ticket(String customer_name, type type) {
        this.customer_name = customer_name;
        this.type = type;
    }

    public void printTicket(String customer_name) {
        type.printTicket(customer_name);
    }
}