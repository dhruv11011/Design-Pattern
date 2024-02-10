package State_Pattern;

public class Notify {
    private State currentState;

    public Notify() {
        currentState = new Private_place();
    }

    public void setState(State state) {
        currentState = state;
    }

    public void Notify() {
        currentState.alert(this);
    }
}