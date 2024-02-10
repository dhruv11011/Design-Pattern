package singleton_pattern;

public final class sample {
    static sample sample=new sample();
    private sample()
    {
        
    }
    static public sample getobj()
    {
        return sample;
    }
}







