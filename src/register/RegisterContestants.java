package register;

import contestant.Contestant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegisterContestants {

    List<Contestant> contestantList = new ArrayList<>();

    public void registerContestants(Scanner sc, List<Contestant> contestantList) {
        System.out.println("Enter the number of contestants: ");
        int numContestants = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numContestants; i++) {
            System.out.println("Enter information for contestant " + (i + 1));
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter surname: ");
            String surname = sc.next();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.println("----------------------");
            sc.nextLine();

            contestantList.add(new Contestant( id, name, surname, age));

            System.out.println("Contestants registered successfully: ");
            displayContestants();
        }

    }

    private void displayContestants() {
        System.out.println("Contestants: ");
        for (Contestant contestant : contestantList) {
            contestant.display();
        }
    }
}
