package flight;

import org.junit.Before;
import org.junit.Test;
import person.CabinCrewMember;
import person.Passenger;
import person.Plane;
import person.Rank;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;


public class FlightTest {
    Flight flight;
    Passenger passenger;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    @Before
    public void before(){
        flight = new Flight( Plane.AIRBUS, "FRE45", "Edinburgh"
                , "Turkey");
        passenger = new Passenger("Ron", 2);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);

    }

    @Test
    public void PassengerCount(){
        assertEquals(3, flight.passengerCount());
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
        assertEquals(new Date(2022,02,14), flight.getDepartureTime());
    }
    @Test
    public void canGetNumberOfSeatsSeats(){
        assertEquals(3, flight.getNumberOfSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger);
        assertEquals(3, flight.passengerCount());
    }

    @Test
    public void CannotBookPassenger(){

        assertEquals(null, flight.CannotBookPassenger());
    }

    @Test
    public void canRelayMessageToPassengers(){
        assertEquals("Welcome aboard to all passengers", flight.CabinCrewRelayMessage());
    }



}
