public class QueueException extends RuntimeException {
    /**
     * Empty constructor.
     */
    public QueueException() {}
    
    /**
     * Constructs a new QueueException, returning the provided String as 
     * exception message.
     * @param message
     */
    public QueueException(String message) {
        super(message); 
    }
}