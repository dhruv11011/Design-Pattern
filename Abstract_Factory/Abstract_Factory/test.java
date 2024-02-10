package Abstract_Factory;
public class test {
    public static void main(String args[]){
        AbstractFactory placeFactory = FactoryProducer.getFactory("Place");
        Place Pl = placeFactory.getPlace("Historical");
        Pl.createplace();
        AbstractFactory photosFactory = FactoryProducer.getFactory("Photos");
        Photos Ph = photosFactory.getPhotos("4k");
        Ph.createPhotos();
    }
}
