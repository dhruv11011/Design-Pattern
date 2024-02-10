public class test {
    public static void main(String[] args) {
        places p = new places_builder().setname("Manali").setrating(5).settourism_attraction(9).getPlaces();
        places p1 = new places_builder().setname("Goa").setrating(5).settourism_attraction(15).getPlaces();
        System.out.println(p);
        System.out.println(p1);
    }
}
