package prototype;

public class demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        place p1 = new place();
        p1.setplaceName("Indian places");
        p1.stateData();
        place s1 = p1.clone();
        p1.getstates().remove(4);
        s1.setplaceName("Indian places");
        System.out.println(p1);
        System.out.println(s1);
    }
}