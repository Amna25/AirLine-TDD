package pilot;

import org.junit.Before;
import person.Rank;

public class PilotTest {
    Pilot pilot;
    @Before
    public void before(){
        pilot = new Pilot("Bilal", Rank.CAPTION, "KER34");
    }
    
}
