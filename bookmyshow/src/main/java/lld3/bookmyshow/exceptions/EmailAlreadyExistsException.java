package lld3.bookmyshow.exceptions;

public class EmailAlreadyExistsException extends RuntimeException {
    public EmailAlreadyExistsException(String email) {
        super("A user with the email: " + email + "exits");
    }
}
