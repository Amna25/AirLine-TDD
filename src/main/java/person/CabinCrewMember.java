package person;

import java.util.ArrayList;

public class CabinCrewMember extends Person{

    private Rank rank;
    public CabinCrewMember(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }
     public String deliverMessage(){
        return "Fasten your seat belts";
     }
}
