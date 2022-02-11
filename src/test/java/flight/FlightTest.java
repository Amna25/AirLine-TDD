package flight;

import org.junit.Before;
import org.junit.Test;
import person.Passenger;
import person.Plane;

import static org.junit.Assert.assertEquals;


public class FlightTest {
    Flight flight;
    Passenger passenger;
    @Before
    public void before(){
        flight = new Flight( Plane.AIRBUS, "FRE45", "Edinburgh"
                , "Turkey", "14:30");
        passenger = new Passenger("Ron", 2);

    }

    @Test
    public void PassengerStartEmpty(){
        assertEquals(0, flight.passengerCount());
    }
    @Test
    public void canHaveFlightNumber(){
        assertEquals("FRE45", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("Edinburgh", flight.findDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("Turkey", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("14:30", flight.getDepartureTime());
    }
    @Test
    public void canGetNumberOfSeatsSeats(){
        assertEquals(544, flight.getNumberOfSeats());
    }
    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger);
        assertEquals(1, flight.passengerCount());
    }
}
