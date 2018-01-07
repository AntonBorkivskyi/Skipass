package skipass;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DaySkipass extends Skipass{
    private int days;

    DaySkipass(WeekdayDays days, int id, String type){
        super(id, type);
        this.days = Integer.valueOf(days.toString());
    }

    DaySkipass(WeekendDays days, int id, String type){
        super(id, type);
        this.days = Integer.valueOf(days.toString());
    }

    public int getDays() {
        return days;
    }

    @Override
    public boolean isValid(){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String cur_date = df.format(new Date());

        String[] parts1 = cur_date.split("-");
        String cur_date_year = parts1[0];
        String cur_date_month = parts1[1];
        String cur_date_day = parts1[2];

        String deadline = getDeadline();
        String[] parts2 = deadline.split("-");
        String deadline_year = parts2[0];
        String deadline_month = parts2[1];
        String deadline_day = parts2[2];

        if(Integer.valueOf(cur_date_year) > Integer.valueOf(deadline_year)){
            setBlocked(true);
            return false;
        }
        if(Integer.valueOf(cur_date_month) > Integer.valueOf(deadline_month)){
            setBlocked(true);
            return false;
        }
        if(Integer.valueOf(cur_date_day) > Integer.valueOf(deadline_day)){
            setBlocked(true);
            return false;
        }
        return true;
    }

    public String getDeadline(){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String cur_date = df.format(new Date());
        String deadline = "";
        try{
            deadline = LocalDate.parse(cur_date).plusDays(getDays() - 1).toString();
        }catch(Exception e){}
        return deadline;
    }

}
