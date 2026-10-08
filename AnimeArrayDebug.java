import java.util.Scanner;

public class AnimeArrayDebug {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] sampleShows = {
            "Demon Slayer",
            "Black Clover",
            "Naruto",
            "One Piece"
        };

        System.out.println("Sample Anime Shows:");

        System.out.println(sampleShows[0]);
        System.out.println(sampleShows[1]);
        System.out.println(sampleShows[2]);
        System.out.println(sampleShows[3]);

        System.out.println();

        System.out.print("How many anime shows do you want to enter? ");
        int size = input.nextInt();

        String[] animeShows = new String[size];

        for (int i = 0; i <= animeShows.length; i++) {
            System.out.print("Enter anime show " + (i + 1) + ": ");
            animeShows[i] = input.nextLine();
        }

        System.out.println("\nYour Anime Shows:");

        for (int i = 0; i < animeShows.length(); i++) {
            System.out.println(animeShows[i]);
        }

        System.out.print("\nEnter a show to search for: ");
        String target = input.nextLine();

        boolean isFound = false;

        for (int i = 0; i < animeShows.length; i++) {
            if (animeShows[i] == target) {
                System.out.println("Show found at index " + i);
                break;
            }
        }

        if (!isFound) {
            System.out.println("Show not found.");
        }

        input.close();
    }
}
