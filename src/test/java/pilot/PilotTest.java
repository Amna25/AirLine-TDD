package pilot;

import org.junit.Before;
import org.junit.Test;
import person.Rank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PilotTest {
    Pilot pilot;
    @Before
    public void before(){
        pilot = new Pilot("Bilal", Rank.CAPTION, "KER34");
    }
    @Test
    public void canHaveName(){
        assertEquals("Bilal", pilot.getName());
    }
    @Test
    public void canHaveRank(){
        assertEquals(Rank.CAPTION, pilot.getRank());
    }
    @Test
    public void canHaveLicenceNumber(){
        assertEquals("KER34", pilot.getLicenceNumber());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Can fly plane", pilot.isValidLicence());
    }
    @Test
    public void cannotFlyPlane(){
        pilot = new Pilot("Jack", Rank.CAPTION, null);
        assertEquals("Can't fly plane",pilot.isValidLicence());
    }



}
