package person;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;
    private Random seatNumber;

    @Before
    public void before() {
        passenger = new Passenger("Ayesha", 3);
        seatNumber = new Random(50);

    }

    @Test
    public void canGetNumberOfBags() {
        assertEquals(3, passenger.getNumberOfBags());
    }

    @Test
    public void canGetPassengerFlightNo(){
        assertEquals(null, passenger.getFlightNo());
    }

    @Test
    public void canSetFlightNo(){
      passenger.setFlightNo("GHK23");
      assertEquals("GHK23", passenger.getFlightNo());
    }

    @Test
    public void canSetSeatNumber(){
        passenger.setSeatNumber(4);
        assertEquals(4, passenger.getSeatNumber());
    }
}