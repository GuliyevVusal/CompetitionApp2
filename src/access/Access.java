package access;

import exception.BannedUserException;

public class Access {

    private static final String CORRECT_USERNAME = "Sarkhan";
    private static final String CORRECT_PASSWORD = "12345";
    private static final int MAX_LOGIN_ATTEPMTS = 3;

    private int loginAttempts = 0;

    public boolean loginPassword(String username, String password) throws BannedUserException {
        if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
            loginAttempts = 0;
            return true;
        } else {
            System.out.println("Invalid username or password. Please try again.");

            loginAttempts++;
            if (loginAttempts == MAX_LOGIN_ATTEPMTS) {
                throw new BannedUserException("You have exceeded the maximum login attempts. You are banned!!!");
            }
            return false;

        }
    }
}