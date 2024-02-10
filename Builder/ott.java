public class ott {
    public static void main(String[] args) {
        webseries wb = new webseries_builder().setname("Mr.Robot").setepisodes(9).setduration(30).getWebseries();
        webseries wb2 = new webseries_builder().setname("Money heist").setepisodes(5).setduration(40).getWebseries();
        System.out.println(wb);
        System.out.println(wb2);
    }
}