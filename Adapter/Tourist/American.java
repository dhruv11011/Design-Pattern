package Tourist;

public class American implements Tourist {
    TravelAdapter TravelAdapter;

    public void Travelling(String Country, String Place){
        if (Country.equalsIgnoreCase("America")) {
            System.out.println("Travelling " + Place + " America");
        } else if (Country.equalsIgnoreCase("India") ||
                Country.equalsIgnoreCase("America") ||
                Country.equalsIgnoreCase("Australia")) {
            TravelAdapter = new TravelAdapter(Country);
            TravelAdapter.Travelling(Country, Place);
        } else {
            System.out.println("Invalid Country");
        }
    }
}