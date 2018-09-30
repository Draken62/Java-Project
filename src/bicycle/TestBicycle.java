package bicycle;


import java.util.Random;

public class TestBicycle {
    private String make;    // make of the bike
    private String type; // type of bike
    private int speed;// speed of bike which is math.random
    private int go;// I assumed this meant this distance of bike travelled


    public TestBicycle(String make, String type, int go, int speed) {
        this.make = make;
        this.type = type;
        this.speed = speed;
        this.go = go;

    }

    public String toString() {
        // Returns name and result to be put to screen
        return  make + " Make of the bike, " + type+" type  of the bike, "+ " Speed the bike travelled =  " + speed + " distance travelled =  " + go + " ! ";

    }
}