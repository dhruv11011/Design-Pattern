package Observer_Pattern;

public class Notifier {
    public static void main(String[] args) {
        place Wonderglobe = new place();

        tourist Tr1 = new tourist("Dhruv");
        tourist Tr2 = new tourist("Niv");
        tourist Tr3 = new tourist("Krishna");

        Wonderglobe.EnrollForplaceUpdate(Tr1);
        Wonderglobe.EnrollForplaceUpdate(Tr2);
        Wonderglobe.EnrollForplaceUpdate(Tr3);

        Tr1.Enrollplace(Wonderglobe);
        Tr2.Enrollplace(Wonderglobe);
        Tr3.Enrollplace(Wonderglobe);

        Wonderglobe.Event("On Our Website");
    }
}
