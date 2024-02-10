package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class place implements Observer {
    private List<tourist> Trans = new ArrayList<>();
    public String EventTouristName;

    public void EnrollForplaceUpdate(tourist Tr) {
        Trans.add(Tr);
    }

    public void UnenrollForplaceUpdate(tourist Tr) {
        Trans.remove(Tr);
    }

    public void Event(String TouristName) {
        this.EventTouristName = TouristName;
        Notify();
    }

    public void Notify() {
        for (tourist Tran : Trans) {
            Tran.EventUpdate();
        }
    }

}
