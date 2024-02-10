public class webseries {
    private String type;// which type of series
    private String name;// name of the series
    private int episodes;// how many episodes
    private double rating;// imdb rating
    private double duration;// time duration of series
    private String uc;// universal certificate

    public webseries(String type, String name, String uc, int episodes, double rating, double duration) {
        this.type = type;
        this.name = name;
        this.uc = uc;
        this.episodes = episodes;
        this.rating = rating;
        this.duration = duration;
    }

    public String toString() {
        return "Name: " + name + " Type: " + type + " episodes: " + episodes + " Rating: " + rating + " Duration: "
                + duration + " U/C: " + uc;
    }
}
