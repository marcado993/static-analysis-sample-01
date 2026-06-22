package ec.edu.epn;

public class TooManyDrinksException extends IllegalArgumentException {
    public TooManyDrinksException(String message) {
        super(message);
    }
}
