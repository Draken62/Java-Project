package PartOne;

import java.util.Scanner;

public class View {



        private int beerNum;

        public Integer Menu() {



            Scanner in = new Scanner(System.in);

            // print menu

            for (int i = 1; i <= 3; i++)

                System.out.println(i + ". Menu item #" + i);

            System.out.println("0. Quit");

            // handle user commands

            boolean quit = false;

            int menuItem;

            do {

                System.out.print("Choose menu item: ");

                menuItem = in.nextInt();

                switch (menuItem) {

                    case 1:

                        System.out.println("Default ");
                        begin();



                        while (true)
                            try {//done something fucking stupid here and drawing a blank
                               int beerNum = 99;
                                this.beerNum = setBeerNum();
                                View.begin();
                                return beerNum;


                            }
                            catch (NumberFormatException BecauseIsaidSo) {
                                System.out.print("Try again: ");
                            }


                        //working

                    case 2:

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
                    case 0:

                        quit = true;

                        break;

                    default:

                        System.out.println("Invalid choice.");

                }

            } while (!quit);

            System.out.println("Bye-bye!");

            return null;
        }
    public static void begin(){
        BeerSong mySong = new BeerSong();
        mySong.drunkSong();
    }

    private int setBeerNum() {
            return beerNum;
    }

}


