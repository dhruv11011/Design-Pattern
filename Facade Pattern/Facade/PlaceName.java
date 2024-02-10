package Facade;

public class PlaceName {
    private test Dehli;
    private test Mumbai;
    private test Rajkot;

    public PlaceName() {
        Dehli = new Dehli();
        Mumbai = new Mumbai();
        Rajkot = new Rajkot();
    }

    public void place1() {
        Dehli.Travel();
    }

    public void place2() {
        Mumbai.Travel();
    }

    public void place3() {
        Rajkot.Travel();
    }
}