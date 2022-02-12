package person;

import java.util.Random;

public class Passenger extends Person {

    private int numberOfBags;
    private int seatNumber;


    public Passenger(String name, int numberOfBags, int seatNumber){
        super(name);
        this.numberOfBags = numberOfBags;
        this.seatNumber = (int)(Math.random() * 50 + 1);
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }
//    generate random seat number
    public int getSeatNumber(){
        return this.seatNumber;
    }
}
