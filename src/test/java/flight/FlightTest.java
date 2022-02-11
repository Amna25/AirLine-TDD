package flight;

import org.junit.Before;
import person.Plane;



public class FlightTest {
    Flight flight;
    @Before
    public void before(){
        flight = new Flight( Plane.AIRBUS, "FRE45", "Edinburgh"
                , "Turkey", "14:30");
    }
}
