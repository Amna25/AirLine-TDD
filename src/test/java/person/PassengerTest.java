package person;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;
    @Before
    public void before(){
        passenger = new Passenger("Ayesha", 3);
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(3, passenger.getNumberOfBags());
    }


}
