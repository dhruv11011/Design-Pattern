package Memento_Pattern;

public class Location_generate {
    private String Place;

    public void setPlace(String Place) {
        this.Place = Place;
    }

    public String getPlace() {
        return Place;
    }

    public CheckPoint savePlaceToLocationSave() {
        return new CheckPoint(Place);
    }

    public void getPlaceFromLocationSave(CheckPoint LocationSave) {
        Place = LocationSave.getPlace();
    }
}
