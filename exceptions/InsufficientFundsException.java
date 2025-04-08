package exceptions;



public class InsufficientFundsException extends Exception {
    // remains
    public InsufficientFundsException() {
        super("Insufficient funds in your account");
    }
    public InsufficientFundsException(String message) {
        super(message);
    }


}
