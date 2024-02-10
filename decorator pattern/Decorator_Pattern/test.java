package Decorator_Pattern;

public class test {
    public static void main(String[] args) {
        places dl = new Delhi();
        places mh = new Mumbai();
        places pmh = new ListDecorator(new Mumbai());
        places pdl = new ListDecorator(new Delhi());
        System.out.println("Taj Mahal is Located here!!");
        dl.Name();
        System.out.println("\nTaj Hotel is Located here!!");
        mh.Name();
    }
}