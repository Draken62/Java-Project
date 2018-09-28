package bicycle;

public class TestBicycle {
    private Integer range;

    public void begin() {
        int speed = (int) (Math.random()*200);
        int range = (int) (Math.random()*50);

        // Create two different Bicycle objects
        BikeResults bike1 = new BikeResults();
        BikeResults bike2 = new BikeResults();

        // Invoke methods on those objects
        bike1.go(range);
        bike1.speedUp(speed);
        bike1.changeGear(2);
        bike1.Biketype();
        bike1.printStates();

        bike2.go(range);
        bike2.speedUp(speed);
        bike2.changeGear(2);
        bike2.go(40);
        bike2.speedUp(10);
        bike2.Biketype();

        bike2.printStates();


    }

}

