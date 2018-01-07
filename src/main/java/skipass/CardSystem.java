package skipass;

import java.util.ArrayList;
import java.util.List;

public class CardSystem {

    private List<Skipass> skipasses = new ArrayList<Skipass>();
    private SkipassFactory sf = new SkipassFactory();

    public CardSystem(){

    }

    public Skipass generateSkipass(Trials trials, String type){
        Skipass skipass = sf.generateSkipass(trials, skipasses.size(), type);
        skipasses.add(skipass);
        return skipass;
    }

    public Skipass generateSkipass(WeekdayDays wdd, String type){
        Skipass skipass = sf.generateSkipass(wdd, skipasses.size(), type);
        skipasses.add(skipass);
        return skipass;
    }

    public Skipass generateSkipass(WeekendDays wed, String type){
        Skipass skipass = sf.generateSkipass(wed, skipasses.size(), type);
        skipasses.add(skipass);
        return skipass;
    }

    public boolean blockSkipass(int id){
        skipasses.get(id).setBlocked(true);
        return true;
    }
}
