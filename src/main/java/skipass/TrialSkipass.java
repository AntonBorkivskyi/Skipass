package skipass;

public class TrialSkipass extends Skipass{
    private int trials;

    public TrialSkipass(Trials trials, int id, String type){
        super(id, type);
        this.trials = Integer.valueOf(trials.toString());
    }

    public int getTrials() {
        return trials;
    }

    @Override
    public boolean isValid(){
        if (getTrials() <= 0){
            setBlocked(true);
            return false;
        }
        return true;
    }

    @Override
    public void riding(){
        this.trials = this.trials - 1;
    }

}
