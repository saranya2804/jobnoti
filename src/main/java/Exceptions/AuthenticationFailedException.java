package Exceptions;

public class AuthenticationFailedException extends RuntimeException {
    public AuthenticationFailedException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Authentication failed: " + super.getMessage();
    }
}
