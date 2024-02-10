public class places_builder {
    private String type;// which type of places like hillstation etc.
    private String name;// name of the place
    private int tourism_attraction;// how many tourism_attraction
    private double rating;// rating

    public places_builder settype(String type) {
        this.type = type;
        return this;
    }

    public places_builder setname(String name) {
        this.name = name;
        return this;
    }

    public places_builder settourism_attraction(int tourism_attraction) {
        this.tourism_attraction = tourism_attraction;
        return this;
    }

    public places_builder setrating(double rating) {
        this.rating = rating;
        return this;
    }

    public places getPlaces() {
        return new places(type, name, tourism_attraction, rating);
    }
}
