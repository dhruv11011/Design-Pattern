package Abstract_Factory;
public class PlaceFactory extends AbstractFactory {
    public Place getpPlace(String Place) {
        if(Place == null) {
            return null;
        }
        if(Place.equalsIgnoreCase("Hill_Station")) {
            return new Hill_Station();
        }
        else if(Place.equalsIgnoreCase("Tracking")) {
            return new Tracking();
        }
        else if(Place.equalsIgnoreCase("Historical")) {
            return new Historical();
        }
        return null;
    }
    Photos getPhotos(String Photos) {
        return null;
    }
    @Override
    Place getPlace(String Place) {
        // TODO Auto-generated method stub
        return null;
    }
}
