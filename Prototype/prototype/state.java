package prototype;

public class state {
    private String place;
    private String stateName;

    public String getplace() {
        return place;
    }

    public void setplace(String place) {
        this.place = place;
    }

    public String getstateName() {
        return stateName;
    }

    public void setstateName(String stateName) {
        this.stateName = stateName;
    }

    public String toString() {
        return "\n" + " place : " + this.place + ", state name: " + this.stateName;
    }
}
