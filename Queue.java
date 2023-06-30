import java.util.LinkedList;

public class Queue<T> {
  private LinkedList<T> queue;

  Queue(){
  queue = new LinkedList<T>();
  }

  public void enqueue(T e){
    queue.add(e);
  }

  public T dequeue(){
    return queue.poll();
  }

  public boolean isEmpty(){
    return queue.size() == 0;    
  }

  public T peek(){
    return queue.peek();
  }
}
