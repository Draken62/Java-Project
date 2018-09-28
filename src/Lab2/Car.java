package Lab2;

public class Car{
    private String make; 	// make of the car
    private String model;	// model of the car
    private int year; // year of manufacture
    private int old;// age of car
    private int  cost;// cost of the car

    // Constructor for Make model Mark cost old
    public Car(String make, String model, int mark, int cost, int old) {
        this.make = make;
        this.model = model;
        this.year = mark;
        this.cost = cost;
        this.old = old;
        }

    public String toString() {
        // Returns name and result to be put to screen
        return make + " " + model +  "  payed " + cost + " received a " + careResult(old) + " for the age of the car " + year;
        }

    private String careResult(int rating) {
        // returns the result of the below depending on what the user input
        String result;

        if (rating >= 1 && rating <=3 ) {
        result = "shiny to new";
        } else if (rating >= 3 && rating <= 6) {
        result = "slightly worn";
        } else if (rating >= 6 && rating <= 8) {
            result = "past its best ";
        }else if (rating >= 8 && rating <= 10) {
            result = "shows signs of age ";

        } else {
        result = "banger";
        }

        return result;
        }


}
