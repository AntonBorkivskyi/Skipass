package skipass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class WeekdayDecorator extends Skipass {
    Skipass skipass;

    public WeekdayDecorator(Skipass skipass){
        this.skipass = skipass;
    }

    public boolean isValid(){
        String day = "";
        DateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
        try{
            day = f1.parse(LocalDate.now().toString()).toString().substring(0,3);
        }catch (Exception e){}
        if (day.equals("Sat") || day.equals("Sun")){
            System.out.println("Not valid day");
            return false;
        }
        return skipass.isValid();
    }

    public void riding(){
        this.skipass.riding();
    }

    public boolean isBlocked() {
        return skipass.isBlocked();
    }

    public void setBlocked(boolean blocked) {
        this.skipass.setBlocked(blocked);
    }

}
