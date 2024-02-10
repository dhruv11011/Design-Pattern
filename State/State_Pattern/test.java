package State_Pattern;

public class test {
    public static void main(String[] args) {
        Notify stateContext = new Notify();
        stateContext.Notify();
        stateContext.Notify();
        stateContext.Notify();
        stateContext.setState(new Public_place());
        stateContext.Notify();
        stateContext.Notify();
        stateContext.Notify();
    }
}
