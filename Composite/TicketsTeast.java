package Composite;

class TicketsTest {
    public static void main(String[] args) {
        Transportation bus = new Leaf(700, "by bus");
        Transportation train = new Leaf(14000, "by Train");
        Transportation flight = new Leaf(54200, "by Flight");
        Transportation boat = new Leaf(54200, "by Boat");
        Transportation cruise = new Leaf(54200, "by cruise");
        
        Tickets whichclass = new Tickets("which class");
        Tickets boatingTickets = new Tickets("Boating Ticket");
        Tickets tourpackage = new Tickets("Tour Package");
        
        whichclass.addTransportation(flight);
        whichclass.addTransportation(bus);
        whichclass.addTransportation(train);
        
        boatingTickets.addTransportation(boat);
        boatingTickets.addTransportation(cruise);
        
        tourpackage.addTransportation(boatingTickets);
        tourpackage.addTransportation(whichclass);
        tourpackage.showPrice();
    }
}