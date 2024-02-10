package Fly_Weight_Pattern;

public class test {
    public static void main(String args[]) {
        Bus b = new Bus();
        for (int i = 0; i < 2; i++) {
            b.getTicket("Dhruv Bhatt", "First Class", i * 1000);
        }
        b.printTickets();
    }
}  