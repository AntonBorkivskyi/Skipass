import org.junit.Test;
import skipass.*;

import static org.junit.Assert.*;


public class TestCardSystem {

    @Test
    public void testMain() throws Exception{
        Main main = new Main();
        main.main();
    }

    @Test
    public void cardSystem() throws Exception{
        CardSystem cs = new CardSystem();
        Turnstile ts = new Turnstile();
        Skipass s1 = cs.generateSkipass(Trials.FIFTY, "trials");
        Skipass s2 = new WeekendDecorator(cs.generateSkipass(WeekendDays.TWO, "days"));
        Skipass s3 = new WeekdayDecorator(cs.generateSkipass(WeekdayDays.FIVE, "days"));


        assertEquals("trials", s1.getType());
        assertEquals(0, s1.getId());
        assertEquals(false, s1.isBlocked());
        s1.setBlocked(true);
        assertEquals(true, s1.isBlocked());

        ts.pass_skipass(s1);
        ts.pass_skipass(s2);
        ts.pass_skipass(s3);
    }

    @Test
    public void trialSkipasses() throws Exception {
        TrialSkipass ts = new TrialSkipass(Trials.FIFTY, 0,"trials");
        assertEquals(50, ts.getTrials());
        ts.riding();
        assertEquals(49, ts.getTrials());
    }
}
