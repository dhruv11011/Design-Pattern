package Abstract_Factory;
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Place")){
            return new PlaceFactory();
        }
        else if (choice.equalsIgnoreCase("Photos")) {
            return new PhotosFactory();
        }
        return null;
    }
}
