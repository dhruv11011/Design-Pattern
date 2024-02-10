package singleton_pattern;

public final class lazy {
    static lazy lazy=null;
    private lazy()
    {
        System.out.println("Places");
    }
    static public lazy getobj()
    {
        if(lazy==null)
        {
            System.out.println("Photos");
            lazy=new lazy();
        }
        return lazy;
    }
}