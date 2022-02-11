package flight;

import person.CabinCrewMember;
import person.Passenger;
import person.Plane;
import person.Rank;
import pilot.Pilot;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Locale;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember>cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String
            destination, String departureAirport, String departureTime){
        pilot = new Pilot("Bilal", Rank.CAPTION, "KER34");
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }
    public int passengerCount(){
        return this.passengers.size();
    }
}
