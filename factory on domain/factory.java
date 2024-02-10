import tourism.*;
public class factory {
    public places getPlaces(String str)
    {
        if(str.equals("rajkot"))
        return new rajkot();
        else if(str.equals("gandhinagar"))
        return new gandhinagar();
        else if(str.equals("surat"))
        return new surat();
        else 
        return null;
    }
}