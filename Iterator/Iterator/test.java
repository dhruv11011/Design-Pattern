package Iterator;

public class test {
    public static void main(String[] args) {
        PlaceNames nr = new PlaceNames();
        for (Iterator iter = nr.getIterator(); iter.isNext();) {
            String Place = (String) iter.next();
            System.out.println("Place Name:" + Place);
        }
    }
}