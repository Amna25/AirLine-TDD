package flightmanager;

import org.junit.Before;
import org.junit.Test;
import person.Plane;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager;

    @Before
    public void before(){
       flightManager = new FlightManager(Plane.JETS);
    }

    @Test
    public void getBaggageWeightReserverd(){
        assertEquals(28000, flightManager.getBaggageReservedForPassengers());
    }
}
