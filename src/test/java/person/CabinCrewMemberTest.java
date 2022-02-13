package person;

import jdk.nashorn.internal.objects.annotations.Function;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;
    ArrayList<String>cabinCrewMembers;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Jess", Rank.PURSER);
        cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add("ada");
        cabinCrewMembers.add("tst");
    }

    @Test
    public void hasName(){
        assertEquals("Jess", cabinCrewMember.getName());
    }

    @Test
    public void hasRankType(){
        assertEquals(Rank.PURSER, cabinCrewMember.getRank() );
    }

//    @Test
//    public void canRelayMessageToPassengers(){
//        assertEquals("Fasten your seat belts", cabinCrewMember.deliverMessage());
//    }

    @Test
    public void canGetRankValue(){
        assertEquals("flightAttendance", cabinCrewMember.rankValue());
    }




}
