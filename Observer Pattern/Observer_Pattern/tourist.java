package Observer_Pattern;

public class tourist {
    private String TouristName;
    private place place = new place();

    public tourist(String TouristName) {
        super();
        this.TouristName = TouristName;
    }

    public void EventUpdate() {
        System.out.println("Welcome " + TouristName + ",\nTour Package is Available " + place.EventTouristName + " Kindly Check it!!");
    }

    public void Enrollplace(place p) {
        place = p;
    }
}
