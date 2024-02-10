package Fly_Weight_Pattern;

public class type {
    String ticketCategory;
    float price;

    public type(String ticketCategory, float price) {
        this.ticketCategory = ticketCategory;
        this.price = price;
    }

    public void printTicket(String customer_name) {
        System.out.println("\nTicket Booked Successfully!!\n");
        System.out.println("Passenger Name is : " + customer_name);
        System.out.println("This is " + ticketCategory + " Ticket.");
        System.out.println(customer_name + " " + "is" + " " + ticketCategory + " " + "Passenger.");
    }
}