import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class QueueTests {
  // constructor is tested inherently in other tests
  @Test
  public void testEnqueue(){
    Queue<Integer> q = new Queue<Integer>();
    q.enqueue(1);
    assertEquals(true, q.peek()==1);
    q.enqueue(5);
    assertEquals(true, q.peek()==1);
  }
  @Test
  public void testDequeue(){
    Queue<Integer> q = new Queue<Integer>();
    q.enqueue(1);
    q.enqueue(5);
    assertEquals(true, q.dequeue()==1);
    assertEquals(true, q.dequeue()==5);

  }
  @Test
  public void testPeek(){
    Queue<Integer> q = new Queue<Integer>();
    assertEquals(true,q.peek()==null);
    q.enqueue(1);
    q.enqueue(10);
    assertEquals(true,q.peek()==1);
  }
  @Test
  public void testIsEmptyWhenEmpty(){
    Queue<Integer> q = new Queue<Integer>();
    assertEquals(true, q.isEmpty());
  }
  @Test
  public void testIsEmptyWhenFull(){
    Queue<Integer> q = new Queue<Integer>();
    q.enqueue(5);
    assertEquals(false, q.isEmpty());
  }
}
