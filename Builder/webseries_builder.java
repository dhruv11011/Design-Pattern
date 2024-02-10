public class webseries_builder {
    private String type;// which type of series
    private String name;// name of the series
    private int episodes;// how many episodes
    private double rating;// imdb rating
    private double duration;// time duration of series
    private String uc;// universal certificate

    public webseries_builder settype(String type) {
        this.type = type;
        return this;
    }

    public webseries_builder setname(String name) {
        this.name = name;
        return this;
    }

    public webseries_builder setepisodes(int episodes) {
        this.episodes = episodes;
        return this;
    }

    public webseries_builder setraiting(double rating) {
        this.rating = rating;
        return this;
    }

    public webseries_builder setduration(double duration) {
        this.duration = duration;
        return this;
    }

    public webseries_builder setuc(String uc) {
        this.uc = uc;
        return this;
    }

    public webseries getWebseries() {
        return new webseries(type, name, uc, episodes, rating, duration);
    }
}
