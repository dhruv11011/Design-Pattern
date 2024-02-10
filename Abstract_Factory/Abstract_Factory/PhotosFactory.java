package Abstract_Factory;

public class PhotosFactory extends AbstractFactory {
    private static final String PhotosType = null;
    public Photos getPhotos(String Photos) {
        if(PhotosType == null) {
            return null;
        }
        if(PhotosType.equalsIgnoreCase("Portrait")) {
            return new Portrait();
        }
        else if(PhotosType.equalsIgnoreCase("Pro")) {
            return new Pro();
        }
        else if(PhotosType.equalsIgnoreCase("4k")) {
            return new _4k();
        }
        return null;
    }
    Place getIndoorEqui(String Place) {
        return null;
    }
    @Override
    Place getPlace(String Place) {
        // TODO Auto-generated method stub
        return null;
    }


}
