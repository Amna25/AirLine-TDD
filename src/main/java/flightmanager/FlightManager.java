package flightmanager;

import person.Passenger;
import person.Plane;

import java.util.ArrayList;

public class FlightManager {
    private Plane plane;
    private ArrayList<Passenger>passengers;

    public FlightManager(Plane plane){
        this.plane = plane;
        this.passengers =new ArrayList<>();
    }

    public int passengerCount(){
       return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int getBaggageReservedForPassengers(){
        return (plane.getTotalWeight()/2);
    }
//    calculate each passenger baggage weight
    public int getEachPassengerBaggageWeight(){
        return getBaggageReservedForPassengers() / plane.getPlaneCapacity();
    }

//    calculate how much baggage weight is booked by passengers of a flight
    public int getTotalReservedBaggage(){
        return getEachPassengerBaggageWeight() * passengerCount();
    }

//    calculate how much overall weight reserved for baggage remains for a flight
    public int baggageWeightRemainForFlight(){
        return getTotalReservedBaggage() - getEachPassengerBaggageWeight();
    }


}
