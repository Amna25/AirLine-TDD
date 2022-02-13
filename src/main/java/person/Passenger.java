package person;



public class Passenger extends Person {

    private int numberOfBags;
    private String flightNo ;
    private int seatNumber;



    public Passenger(String name, int numberOfBags){
        super(name);
        this.numberOfBags = numberOfBags;

    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public String getFlightNo(){

        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
