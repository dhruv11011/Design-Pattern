package Memento_Pattern;

import java.util.*;

public class Location_Save {
    private List<CheckPoint> CheckPointList = new ArrayList<CheckPoint>();

    public void add(CheckPoint Place) {
        CheckPointList.add(Place);
    }

    public CheckPoint get(int index) {
        return CheckPointList.get(index);
    }
}
