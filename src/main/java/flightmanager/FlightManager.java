package flightmanager;

import person.Passenger;
import person.Plane;

import java.util.ArrayList;

public class FlightManager {
    private Plane plane;
    private ArrayList<Passenger>passenger;

    public FlightManager(Plane plane){
        this.plane = plane;
        this.passenger =new ArrayList<>();
    }
    public int getBaggageReservedForEachPassenger(){
        return (plane.getTotalWeight()/2) *1;
    }
}
