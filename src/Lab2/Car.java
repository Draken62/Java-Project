package Lab2;

public class Car{
    private String make; 	// Name of the student
    private String model;	// Surname of the student
    private int year;
    private double cost;// Mark of the student

// Constructor
public Car(String firstName, String lastName, int i, int mark, double cost) {
        this.make = firstName;
        this.model = lastName;
        this.year = mark;
        this.cost = cost;
        }

public String toString() {
        // Returns name and result to be printed by UI
        return make + " " + model + " received a " + resultName(year) + " for a mark of " + year;
        }

private String resultName(int mark) {
        // Translates numeric result to their equivalent grade mark
        String result = "";

        if (mark >= 1 ) {
        result = "shiny to new"; 	// Result above 85 gets Distinction
        } else if (mark >= 3 && mark <= 6) {
        result = "Merit";		// Result between 65 and 84 gets Merit
        } else if (mark >= 6 && mark <= 8) {
            result = "Pass";
        }else if (mark >= 8 && mark <= 10) {
            result = "Pass";
            // Result between 40 and 64 gets Pass
        } else {
        result = "banger";		// Otherwise gets Fail
        }

        return result;
        }

        // We don't create mutators or accessors as we don't want this class
        // to be modified outside the Constructor

        }
