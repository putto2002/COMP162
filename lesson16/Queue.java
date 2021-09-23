/* File: Queue.java - March 2021 */


/**
 * An interface defining behaviours of a Queue of elements (T).
 *
 * @author Steven R. Livingstone
 * @version 1.0, 2021
 */
public interface Queue<T> {
    /**
     * Add element T to back of queue
     * @param T Element to be added to back of queue.
     */
    void add(T element);

    
    /**
     * Remove and return element T from front of queue
     * @return Element at front of queue
     */
    T remove();

    
    /**
     * Return element T from front of queue
     * @return Element at front of queue
     */
    T peek();


    /**
     * Returns True if this queue contains no elements, otherwise False.
     * @return True if this queue contains no elements, otherwise False.
     */
    boolean isEmpty();


    /**
     * Returns the number of elements in this queue.  
     * @return the number of elements in this queue
     */
    int size();


    /**
     * Returns a pretty string representation of our queue.
     * @return String representation showing queue contents.
     */
    @Override
    String toString();
}
