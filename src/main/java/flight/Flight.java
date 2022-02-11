package flight;

import person.CabinCrewMember;
import person.Passenger;
import person.Plane;
import pilot.Pilot;

import java.sql.Time;
import java.text.DateFormat;
import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember>cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Time departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMembers,Plane plane, String flightNumber, String
            destination, String departureAirport, Time departureTime){
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<>();
        
    }
}
