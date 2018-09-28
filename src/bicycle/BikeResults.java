package bicycle;
import java.util.Scanner;
public class BikeResults {
    int randomNumbers = 0;
    int speed;
    int gear = 1;
    String make = " Bloody bike ";
    String type;




    public void go(int newValue) {
        randomNumbers = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }
    public String Biketype() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter type of bike !");
        type = keyboard.next();
        return type;
    }


    public void printStates() {
        System.out.println("Go:" + randomNumbers + " speed:" +
                speed + " Make:" +make+ " type"+ type+" Gear "+ gear);
    }
}
