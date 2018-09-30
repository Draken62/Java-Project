package PartOne;


import java.util.Scanner;

public class View {

    private boolean quit;
    public static Integer beerNum = 99;


    public static Integer showMenuAndGetResult() {
        View menu = new View();
        menu.activate();
        return null;
    }

    private void activate() {
        try (Scanner in = new Scanner(System.in)) {
            show();

            while (!quit) {
                System.out.print("Choose menu item: ");
                int menuItem = in.nextInt();

                if (menuItem == 1)
                    onMenuItem1(in);
                else if (menuItem == 2)
                    onMenuItem2(in);
                else if (menuItem == 0)
                    onMenuQuit();
                else
                    System.out.println("Invalid choice.");
            }
            System.out.println("Bye-bye!");
        }
    }

    private void show() {
        for (int i = 1; i <= 3; i++)
            System.out.println(i + ". Menu item #" + i);

        System.out.println("0. Quit");
        System.out.println();
    }

    private void onMenuItem1(Scanner scan) {
        System.out.println("Default ");
        Menu();
        // TODO menu 1 logic incapsulation
    }

    private void onMenuItem2(Scanner scan) {
        System.out.println("Enter your number to play the song: ");
        scan.nextInt();
        BeerSong.drunkSong();
        // TODO menu 2 logic incapsulation
    }
    public void Menu() {
        BeerSong.drunkSong();
    }


    private void onMenuQuit() {
          quit = true;
    }
}
