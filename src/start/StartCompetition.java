package start;

import contestant.Contestant;

import java.util.List;
import java.util.Scanner;

public class StartCompetition {
    public static void startCompetition(Scanner sc, List<Contestant> contestants) {
        System.out.println("Cometiton started!");

        int selectedContestantIndex = (int) (Math.random() * contestants.size());
        Contestant selectedContestant = contestants.get(selectedContestantIndex);

        System.out.println("The system selected a contestant. Contestant details: ");
        selectedContestant.display();

        System.out.println("Guess the selected number: ");

        while (true) {
            System.out.println("Enter your guess: ");
            int userGuess = sc.nextInt();
            sc.nextLine();

            if (userGuess == selectedContestant.getId()) {
                System.out.println("Congratulations, you won!");
                break;
            } else {
                System.out.println("You failed. Try again.");
            }
        }

    }
}
