package skipass;

public class SkipassFactory{

    public SkipassFactory(){

    }

    public Skipass generateSkipass(WeekendDays wed, int id, String type){
        return new DaySkipass(wed, id, type);
    }

    public Skipass generateSkipass(WeekdayDays wdd, int id, String type){
        return new DaySkipass(wdd, id, type);
    }

    public Skipass generateSkipass(Trials trials, int id, String type){
        return new TrialSkipass(trials, id, type);
    }
}
