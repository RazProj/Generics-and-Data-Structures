public class EmptyListException extends Exception {
    // Default constructor
    public EmptyListException() {
        super("The list is empty.");
    }

    // Constructor that accepts a custom error message
    public EmptyListException(String message) {
        super(message);
    }
}
