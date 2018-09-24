package Lab2;

import java.util.ArrayList;
import java.util.Scanner;


public class TestCarPartA {

            //constant to fixed number of cars
            private final static int MINCARS = 1;

            public static void main(String[] args) {
                // List to store all cars  information
                ArrayList<Car> Carsrecord = new ArrayList<Car>();

                // Scanner to read from keyboard
                
                Scanner keyboard = new Scanner(System.in);

                // We request the amount of cars to process. Needs to be above the MINIMUM
                int totalAmountOfCars = 0;
                while (totalAmountOfCars < MINCARS) {
                    System.out.println("Please enter the amount of cars you are putting into database: ");
                    totalAmountOfCars = keyboard.nextInt();
                    if (totalAmountOfCars < MINCARS) {
                        System.out.println("That's too few. You need to record at least " + MINCARS + " per session.");
                    }
                }

                // We loop as many times as cars were requested in previous input
                for (int i = 0; i < totalAmountOfCars; i++) {
                    String make, model;
                    int year;
                    int cost;
                    int old;

                    
                    // Ask for car dealer for  data by console, and store it in temporary variables

                    System.out.println("Please enter the  the make of the car: ");
                    make = keyboard.next();
                    System.out.println("Please enter the the model of the car: ");
                    model = keyboard.next();
                    System.out.println("Please  tell us how old the car is " + make + " " + model + ": ");
                    old = keyboard.nextInt();
                    System.out.println("Please enter the year for " + make + " " + model + ": ");
                    year = keyboard.nextInt();
                    System.out.println("Please enter cost for " + make + " " + model + ": ");
                    cost = keyboard.nextInt();

                    // Used variables to create a new cars object, and add it to the list
                    Carsrecord.add(new Car(make, model,year,cost,old));
                }
                keyboard.close(); // Close Scanner

                // List of total results entered in this session
                System.out.println("Here is the list breakdown and costs:");
                // We loop the entire list

                for (Car cardata: Carsrecord) {
                    // and print each Student object by console
                    System.out.println(cardata.toString());
                }
            }
        }


