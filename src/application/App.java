package application;

import access.Access;
import exception.BannedUserException;
import menu.Menu;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws BannedUserException {
        Scanner sc = new Scanner(System.in);
        Access access = new Access();
        Menu menu = new Menu();

        while (true) {
            System.out.println("Welcome to the competition ");
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (access.loginPassword(username, password)) {
                menu.displayMenu(sc);
            } else {
                System.out.println("Login failed. Please try again.");
            }
        }
    }

}
