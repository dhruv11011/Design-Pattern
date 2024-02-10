import tourism.surat;
import tourism.gandhinagar;
import tourism.rajkot;
import java.util.*;

class test {
    public static void main(String[] args) {
        System.out.println("Enter The Place Name : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        factory fact = new factory();
        fact.getPlaces(str).run();
    }
}