import esports.*;
public class factory {
    public onlinegames getOnlinegames(String str)
    {
        if(str.equals("bgmi"))
        return new BattleGroundMobileIndia();
        else if(str.equals("cr"))
        return new ClashRoyal();
        else if(str.equals("coc"))
        return new ClashofClans();
        else 
        return null;
    }
}
