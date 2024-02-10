package Memento_Pattern;

public class test {
    public static void main(String[] args) {
        Location_generate originator = new Location_generate();
        Location_Save caretaker = new Location_Save();

        originator.setPlace("1 : Mumbai");
        originator.setPlace("2 : Dehli");
        caretaker.add(originator.savePlaceToLocationSave());

        originator.setPlace("3 : Ahmedabad");
        caretaker.add(originator.savePlaceToLocationSave());

        originator.setPlace("4 : Gandhinagar");
        System.out.println("Current Place : " + originator.getPlace());

        originator.getPlaceFromLocationSave(caretaker.get(0));
        System.out.println("First Saved Place : " + originator.getPlace());
        originator.getPlaceFromLocationSave(caretaker.get(1));
        System.out.println("Second Saved Place : " + originator.getPlace());
    }
}
