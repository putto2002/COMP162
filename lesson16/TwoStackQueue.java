import java.util.Stack;
public class TwoStackQueue<T> implements Queue<T>{
    int size;
    Stack<T> left;
    Stack<T> right;

    public TwoStackQueue(){
        this.size = 0;
        this.left = new Stack<T>();
        this.right = new Stack<T>();
    }

    public void add(T element){
        left.push(element);
        size++;
    }

    public T remove(){
        if(right.isEmpty()){
            if(left.isEmpty()) throw new QueueException("Queue is empty");
            while(!left.isEmpty()){
                right.push(left.pop());
            }
        }

        size--;
        return right.pop();
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public T peek(){
        if(right.isEmpty()){
            if(left.isEmpty()) throw new QueueException("Queue is empty");
            while(!left.isEmpty()){
                right.push(left.pop());
            }
        }
        return right.peek();

    }

    public String debug(){
        return left.toString() + right.toString();
    }

    public String toString(){
      return " ";

    }

    

}