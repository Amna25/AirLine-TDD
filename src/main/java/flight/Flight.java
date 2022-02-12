package flight;

import person.CabinCrewMember;
import person.Passenger;
import person.Plane;
import person.Rank;
import pilot.Pilot;

import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember>cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    protected Date departureTime;

    public Flight(Plane plane, String flightNumber, String
            destination, String departureAirport){
        pilot = new Pilot("Bilal", Rank.CAPTION, "KER34");
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = new Date(2022,02,14);
    }
    public int passengerCount(){
        return this.passengers.size();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String findDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

// check number of seats in one plane
    public int getNumberOfSeats() {
        return plane.getPlaneCapacity();
    }

//  add passenger if there is any remaining seat
    public void bookPassenger(Passenger passenger){
        if(plane.getPlaneCapacity() > 0){
            this.passengers.add(passenger);
        }
    }

//    Cannot book passengers
    public String CannotBookPassenger(){
       if(passengerCount() > plane.getPlaneCapacity()){
           return "Cannot Book Passengers";
        }
       return null;
    }
}
