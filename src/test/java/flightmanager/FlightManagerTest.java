package flightmanager;

import org.junit.Before;
import org.junit.Test;
import person.Passenger;
import person.Plane;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager;
    Passenger passenger;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;

    @Before
    public void before(){
       flightManager = new FlightManager(Plane.JETS);
       passenger = new Passenger("Ruby", 4);
       flightManager.addPassenger(passenger);
       flightManager.addPassenger(passenger1);
       flightManager.addPassenger(passenger2);
       flightManager.addPassenger(passenger3);
       flightManager.addPassenger(passenger4);
       flightManager.addPassenger(passenger5);
    }

    @Test
    public void getPassengerCount(){
        assertEquals(6, flightManager.passengerCount());
    }
    @Test
    public void canAddPassengers(){
        assertEquals(6, flightManager.passengerCount());
    }

    @Test
    public void getBaggageWeightReserverd(){
        assertEquals(28000, flightManager.getBaggageReservedForPassengers());
    }

    @Test
    public void calculateBagReservedForEachPassenger(){
        assertEquals(93, flightManager.getEachPassengerBaggageWeight());
    }

    @Test
    public void getTotalReservedBaggage(){
        assertEquals(558, flightManager.getTotalReservedBaggage());
    }
}
