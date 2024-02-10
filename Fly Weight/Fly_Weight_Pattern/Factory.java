package Fly_Weight_Pattern;
import java.util.*;

public class Factory {
    static Map<String, type> ticketCategories = new HashMap<>();

    public static type gettype(String ticketCategory, float price) {
        type result = ticketCategories.get(ticketCategory);
        if (result == null) {
            result = new type(ticketCategory, price);
            ticketCategories.put(ticketCategory, result);
        }
        return result;
    }
}