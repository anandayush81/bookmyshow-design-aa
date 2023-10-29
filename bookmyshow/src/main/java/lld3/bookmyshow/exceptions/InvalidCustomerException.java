package lld3.bookmyshow.exceptions;

public class InvalidCustomerException extends RuntimeException {
    public InvalidCustomerException() {
        super("Email is mandatory");
    }
}
