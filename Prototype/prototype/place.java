package prototype;

import java.util.ArrayList;
import java.util.List;

public class place implements Cloneable {
    String[] arr1 = { "Mumbai", "Surat", "Dehli", "Rajkot", "Gandhinagar" };
    String[] arr2 = { "Maharashtra", "Gujarat", "Dehli", "Gujarat", "Gujarat" };
    private String placeName;
    List<state> states = new ArrayList<>();

    public String getplaceName() {
        return placeName;
    }

    public void setplaceName(String placeName) {
        this.placeName = placeName;
    }

    public List<state> getstates() {
        return states;
    }

    public void setstates(List<state> states) {
        this.states = states;
    }

    public void stateData() {
        for (int i = 0; i < 5; i++) {
            state s = new state();
            s.setplace(arr1[i]);
            s.setstateName(arr2[i]);
            getstates().add(s);
        }

    }

    public String toString() {
        return "place name: " + this.placeName + "\n" + "States: " + this.states;
    }

    protected place clone() throws CloneNotSupportedException {
        place p = new place();
        for (state s : this.getstates()) {
            p.getstates().add(s);
        }
        return p;
    }

}
