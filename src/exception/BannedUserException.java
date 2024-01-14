package exception;

public class BannedUserException extends Exception {

    public BannedUserException(String message) {
        super(message);
    }
}
