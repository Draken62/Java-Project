package PartOne;

public class BeerSong {
    //Here my song begins

    public void  drunkSong(){
        //Vars have been got in the View menu
        View a = new View();
        int beerNum = a.Menu();

        String word = "bottles";

        while(beerNum > 0){
            //using the if statement here allows me to specify if we reach one bottle word bottles is swapped for for bottle
            if (beerNum == 1){
                word = "bottle";
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum > 0){
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println("---------------------------------------");
            }else {
                System.out.println("No more bottles of beer on the wall");
                System.out.println("You are now drunk Congratulations");
            }
        }
    }
}
