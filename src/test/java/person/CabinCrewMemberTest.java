package person;

import jdk.nashorn.internal.objects.annotations.Function;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Jess", Rank.CAPTION);
    }

    @Test
    public void hasName(){
        assertEquals("Jess", cabinCrewMember.getName());
    }

    @Test
    public void hasRankType(){
        assertEquals(Rank.CAPTION, cabinCrewMember.getRank() );
    }

    @Test
    public void canRelayMessageToPassengers(){
        assertEquals("Fasten your seat belts", cabinCrewMember.deliverMessage());
    }


}
