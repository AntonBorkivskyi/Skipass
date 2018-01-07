import skipass.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {

    public Main(){

    }

    public void main() {

        CardSystem cs = new CardSystem();
        Turnstile ts = new Turnstile();
        Skipass sp1 = new WeekendDecorator(cs.generateSkipass(WeekendDays.TWO, "days"));
        Skipass sp2 = new WeekendDecorator(cs.generateSkipass(WeekendDays.ONE, "days"));
        Skipass sp4 = new WeekdayDecorator(cs.generateSkipass(WeekdayDays.ONE, "days"));
        Skipass sp3 = cs.generateSkipass(Trials.TWENTY, "trials");

        ts.pass_skipass(sp4);

        for(int i = 0; i < 2; i++){
            ts.pass_skipass(sp1);
            ts.pass_skipass(sp2);
            for(int j = 0; j < 10; j++){
                ts.pass_skipass(sp3);
            }
        }

        ts.pass_skipass(sp3);
        ts.pass_skipass(sp3);

    }

}
