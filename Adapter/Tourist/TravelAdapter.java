package Tourist;

public class TravelAdapter implements Tourist {
    IMPTourist iTourist;

    public TravelAdapter(String Platform) {
        if (Platform.equalsIgnoreCase("India")) {
            iTourist = new India();
        } else if (Platform.equalsIgnoreCase("Australia")) {
            iTourist = new Australia();
        } else if (Platform.equalsIgnoreCase("America")) {
            iTourist = new America();
        }
    }

    public void Travelling(String Platform, String PlaceName) {
        if (Platform.equalsIgnoreCase("Dehli")) {
            iTourist.TravelIndia(PlaceName);
        } else if (Platform.equalsIgnoreCase("Sydney")) {
            iTourist.TravelAustralia(PlaceName);
        } else if (Platform.equalsIgnoreCase("NYC")) {
            iTourist.TravelAmerica(PlaceName);
        }
    }
}