public class places {
    private String type;// which type of places like hillstation etc.
    private String name;// name of the place
    private int tourism_attraction;// how many tourism_attraction
    private double rating;// rating

    public places(String type, String name, int tourism_attraction, double rating) {
        this.type = type;
        this.name = name;
        this.tourism_attraction = tourism_attraction;
        this.rating = rating;
    }

    public String toString() {
        return "Name: " + name + " Type: " + type + " tourism_attractions: " + tourism_attraction + " Rating: " + rating;
    }
}
