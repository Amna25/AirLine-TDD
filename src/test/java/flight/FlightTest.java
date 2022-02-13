package flight;

import org.junit.Before;
import org.junit.Test;
import person.CabinCrewMember;
import person.Passenger;
import person.Plane;
import person.Rank;

import javax.swing.plaf.PanelUI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import static org.junit.Assert.assertEquals;


public class FlightTest {
    Flight flight;
    Passenger passenger;
    DateTimeFormatter dateTimeFormatter;
    LocalDateTime departureTime;

    @Before
    public void before(){

        dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm dd-MMM-yyyy");
        departureTime = LocalDateTime.parse("12:00 14-Feb-2022",dateTimeFormatter);

        flight = new Flight( Plane.AIRBUS, "FRE45", "Edinburgh"
                , "Turkey", departureTime);
        passenger = new Passenger("Ron", 2);

    }

    @Test
    public void PassengerCount(){
        assertEquals(0, flight.passengerCount().size());
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
        assertEquals("2022-02-14T12:00" , flight.getDepartureTime().toString());
    }
    @Test
    public void canGetNumberOfSeatsSeats(){
        assertEquals(3, flight.getNumberOfSeats());
    }

//  test to get unassigned seats
    @Test
    public void canGetUnassignedSeats(){
        assertEquals(3, flight.getUnassignedSeats().size());
        assertEquals((Object) 1, flight.getUnassignedSeats().get(0));
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(3, flight.passengerCount().size());
    }


    @Test
    public void CannotBookPassenger(){
        assertEquals(null, flight.CannotBookPassenger());
    }

    @Test
    public void canRelayMessageToPassengers(){
        assertEquals("Welcome aboard to all passengers", flight.CabinCrewRelayMessage());
    }

    @Test
    public void cannotBookSameSeatTwice(){
//        book 30 passenger
        for(int i = 0; i < 30; i++){
            flight.bookPassenger(new Passenger("Amna",4));
        }
//        get their seat number
        ArrayList<Integer>bookedSeatNumber = new ArrayList<Integer>();
        for (Passenger passenger : flight.passengerCount()){
            bookedSeatNumber.add(passenger.getSeatNumber());
        }
//        Convert that list into unique ArrayList
        List<Integer> uniqueNumbers = bookedSeatNumber.stream().distinct().collect(Collectors.toList());
//        check the length of these two lists are equal
        assertEquals(uniqueNumbers.size(), bookedSeatNumber.size());
    }



}
