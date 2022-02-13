package person;

import java.util.Random;

public class Passenger extends Person {

    private int numberOfBags;
    private String flightNo = null;
    private int seatNumber;



    public Passenger(String name, int numberOfBags){
        super(name);
        this.numberOfBags = numberOfBags;
        Random rand = new Random();
      this.seatNumber = rand.nextInt(10) + 1;

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
