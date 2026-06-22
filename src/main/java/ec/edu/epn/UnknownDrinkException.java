package ec.edu.epn;

public class UnknownDrinkException extends IllegalArgumentException {
    public UnknownDrinkException(String message) {
        super(message);
    }
}
