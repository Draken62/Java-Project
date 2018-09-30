package bicycle;

import java.util.ArrayList;
import java.util.Scanner;

public class BikeResults {

    private final static int MINBIKES = 2;

    ArrayList<TestBicycle> bikeRecord = new ArrayList<TestBicycle>();

    public String begin() {


        int totalAmountOfBikes = 0;
        while (totalAmountOfBikes < MINBIKES) {
            System.out.println("Please enter the amount of bikes you wish to input: ");
            Scanner keyboard = new Scanner(System.in);
            totalAmountOfBikes = keyboard.nextInt();
            if (totalAmountOfBikes < MINBIKES) {
                System.out.println("Way to low can you count " + MINBIKES + " !");
            }

            for (int i = 0; i < totalAmountOfBikes; i++) {
                int go = (int) (Math.random() * 2000);//random distance  travelled
                String make;
                String type;
                int speed = (int) (Math.random() * 200);

                System.out.println("Please enter the  make of the Bike ");
                make = keyboard.next();
                System.out.println("Please enter the the type of the Bike: ");
                type = keyboard.next();
                // Used variables to create a new cars object, and add it to the list
                bikeRecord.add(new TestBicycle(make, type, go, speed));
            }
            keyboard.close();
        }

        for (TestBicycle bikeData : bikeRecord) {
            // and print each bike to string
            System.out.println(bikeData.toString());

        }
        return null;
    }
}


