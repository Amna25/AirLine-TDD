package person;

import java.util.Random;

public class Passenger extends Person {

    private int numberOfBags;
    private String flightNo = null;



    public Passenger(String name, int numberOfBags){
        super(name);
        this.numberOfBags = numberOfBags;
        Random rand = new Random();
//        this.seatNumber = rand.nextInt(10) + 1;
//        Random seatNumber = (int)(Math.random() * 50);
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
}
