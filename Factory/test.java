import esports.ClashofClans;
import esports.ClashRoyal;
import esports.BattleGroundMobileIndia;
import java.util.*;

class test {
    public static void main(String[] args) {
        System.out.println("Enter The Game Name : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        factory fact = new factory();
        fact.getOnlinegames(str).run();
    }
}