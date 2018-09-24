package Lab2;

public class Car{
    private String make; 	// make of the car
    private String model;	// model of the car
    private int year; // year of manufacture
    private int  cost;// cost of the car

// Constructor
public Car(String make, String model, int mark, int cost) {
        this.make = make;
        this.model = model;
        this.year = mark;
        this.cost = cost;
        }

public String toString() {
        // Returns name and result to be printed by UI
        return make + " " + model +  "  payed " + cost + " received a " + resultName(year) + " for a mark of " + year;
        }

private String resultName(int rating) {
        // Translates numeric result to their equivalent grade rating
        String result;

        if (rating >= 1 && rating <=3 ) {
        result = "shiny to new"; 	// #rating one and two equals shiny to new
        } else if (rating >= 3 && rating == 6) {
        result = "Merit";		// Rating between 3 and 6 gets Merit
        } else if (rating >= 6 && rating == 8) {
            result = "Pass";
        }else if (rating >= 8 && rating <= 10) {
            result = "Pass";
            // Rating between 8 and 10 gets Pass
        } else {
        result = "banger";		// Otherwise gets Fail
        }

        return result;
        }


        }
