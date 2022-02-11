package pilot;

import person.CabinCrewMember;
import person.Rank;

public class Pilot extends CabinCrewMember {
    String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String isValidLicence(){
        if(this.licenceNumber != null){
            return "Can fly plane";
        }
        return "Can't fly plane";
    }
}
