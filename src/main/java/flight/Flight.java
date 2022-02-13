package flight;

import person.CabinCrewMember;
import person.Passenger;
import person.Plane;
import person.Rank;
import pilot.Pilot;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Flight {
    private Pilot pilot;
    private ArrayList<String>cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private LocalDateTime departureTime;
    private List<Integer> unassignedSeats;


    public Flight(Plane plane, String flightNo, String
            destination, String departureAirport, LocalDateTime departureTime){
        pilot = new Pilot("Bilal", Rank.CAPTION, "KER34");
        this.cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add("Ada");
        cabinCrewMembers.add("Adam");
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
//        Create an array of unassigned seats from number 1 to max capacity of plane
        this.unassignedSeats = IntStream.rangeClosed(1, plane.getPlaneCapacity()).boxed().collect(Collectors.toList());


    }
    public ArrayList<Passenger> passengerCount(){
        return this.passengers;
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

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

//    check unassigned seats
    public List<Integer> getUnassignedSeats(){
        return unassignedSeats;
    }

// check number of seats in one plane
    public int getNumberOfSeats() {
        return plane.getPlaneCapacity();
    }

//  add passenger if there is any remaining seat
    public void bookPassenger(Passenger passenger){
        if(plane.getPlaneCapacity() > 0){
            this.passengers.add(passenger);
            passenger.setFlightNo(flightNo);
            assignSeats(passenger);

        }
    }

//    Cannot book passengers
    public String CannotBookPassenger(){
       if( plane.getPlaneCapacity() < 0 ){
           return "Cannot Book Passengers";
        }
       return null;
    }

//  Give Message To Passengers
    public String CabinCrewRelayMessage(){
        String result;
        if(this.cabinCrewMembers.size() > 1){
            result = "Welcome aboard to all passengers";
        }else{
            result = "Assign the cabin crew to flight first";
        }
        return result;
    }

//    Assign seat number to random number
    public int selectRandomSeatNumber(){
        int randomIndex = new Random().nextInt(unassignedSeats.size());
        return unassignedSeats.get(randomIndex);
    }
//    Assign RandomSeats To passengers
    public void assignSeats(Passenger passenger){
        int assignedSeats = selectRandomSeatNumber();
        passenger.setSeatNumber(assignedSeats);
        unassignedSeats.remove((Object)assignedSeats);
    }

}
