package pilot;

import person.CabinCrewMember;
import person.Rank;

import java.util.ArrayList;

public class Pilot extends CabinCrewMember {
    String licenceNumber;
    ArrayList<String > flyingCrew;

    public Pilot(String name, Rank  rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
        this.flyingCrew = new ArrayList<>();

    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public int countFlyingCrew(){
        return this.flyingCrew.size();
    }

    public void addPilot(String name){
         this.flyingCrew.add(name);
    }

    public String flyPlane(){
        String result;
        if(countFlyingCrew() > 0){
            result = "Plane ready to departure";
        }else{
            result="Find the Pilot First";
        }
        return result;
    }

}

