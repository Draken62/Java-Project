import java.util.Scanner;

public class View{


    public int beerNum;

    public Integer Menu() {



        System.out.println("Enter your number to play the song: ");
        Scanner scan = new Scanner(System.in);

        while (true)
            try {
                beerNum = Integer.parseInt(scan.nextLine());
                this.beerNum = setBeerNum();
                return beerNum;

            } catch (NumberFormatException BecauseIsaidSo) {
                System.out.print("Try again: ");
            }

    }

    public void begin(){
        BeerSong mySong = new BeerSong();
        mySong.startSong();
    }

    public int setBeerNum() {
        return beerNum;
    }

}