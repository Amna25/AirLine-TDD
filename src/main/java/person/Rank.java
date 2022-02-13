package person;

public enum Rank {
    CAPTION("firstOfficer"),
    PURSER("flightAttendance");

    private final String rankValue;

    Rank(String rankValue){
        this.rankValue = rankValue;
    }

    public String getRankValue(){

        return rankValue;
    }


}
