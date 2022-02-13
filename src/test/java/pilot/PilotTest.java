package pilot;

import org.junit.Before;
import org.junit.Test;
import person.Rank;

import java.util.ArrayList;

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
        pilot.addPilot("RH");
        pilot.addPilot("RH");
        assertEquals("Plane ready to departure", pilot.flyPlane());
    }

    @Test
    public void canCountPilot(){
        assertEquals(0,pilot.countFlyingCrew());
    }

    @Test
    public void canAddPilot(){
        pilot.addPilot("RH");
        assertEquals(1,pilot.countFlyingCrew());
    }


}
