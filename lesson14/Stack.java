import java.util.*;
public class Stack<T> {
    private static final int DEFAULT_LENGTH = 10;
    private T[] stack;
    private int size;

    public Stack(){
        this(DEFAULT_LENGTH);
    }
     
    @SuppressWarnings("unchecked")
    public Stack(int length) {
        this.stack = (T[]) new Object[length];
        this.size = 0;
    }

    public void push(T element){
        if(size  >= stack.length){
            stack = Arrays.copyOf(stack, stack.length * 2);
        }
        stack[size] = element;
        size++;
    }

    public T pop(){
        if(isEmpty()) throw new EmptyStackException();
        size--;
        return stack[size];
    }

    public T peek(){
        if(isEmpty()) throw new EmptyStackException();
        return stack[size-1];
    }


    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public int search(T element){
        for(int i = 0; i < stack.length; i++){
            if(stack[i].equals(element)) return i;
        }
        return -1;

    }

    public String toString(){
        return Arrays.toString(stack);
    }

}