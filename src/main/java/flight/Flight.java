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
    private ArrayList<String>cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departureAirport;
    protected Date departureTime;



    public Flight(Plane plane, String flightNo, String
            destination, String departureAirport){
        pilot = new Pilot("Bilal", Rank.CAPTION, "KER34");
        this.cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add("Ada");
        cabinCrewMembers.add("Adam");
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = new Date(2022,02,14);


    }
    public int passengerCount(){
        return this.passengers.size();
    }

    public String getFlightNumber() {
        return flightNo;
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
        if(plane.getPlaneCapacity() > passengerCount()){
            this.passengers.add(passenger);
        }
    }

//    Cannot book passengers
    public String CannotBookPassenger(){
       if( plane.getPlaneCapacity() < passengerCount() ){
           return "Cannot Book Passengers";
        }
       return null;
    }

//    check flight ateendence size
    public String CabinCrewRelayMessage(){
        String result;
        if(this.cabinCrewMembers.size() > 1){
            result = "Welcome aboard to all passengers";
        }else{
            result = "Assign the cabin crew to flight first";
        }
        return result;
    }

//    seat Reserved for each passenger
//    public int seatReservedForPassenger(Passenger passenger){
//        int passengerSeat = 1;
//        for(Passenger eachPassenger : passengers){
//            if(eachPassenger.getName().equals(passenger.getName())) {
//                passengerSeat = eachPassenger.getSeatNumber();
//            }
//        }
//        return passengerSeat;
//    }

}
