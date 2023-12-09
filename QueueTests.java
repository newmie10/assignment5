import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.*;


public class QueueTests {
    @Test
    public void testConstructor() {
        Queue<Car> emptyQueue = new Queue<Car>();
        Queue<Car> newQueue = new Queue<Car>();
        assertTrue(emptyQueue.getQueue().equals(newQueue.getQueue()));
    }

    @Test
    public void testEnqueue() {
        Queue<Car> emptyQueue = new Queue<Car>();
        LinkedList<Car> newList = new LinkedList<Car>();
        Car newCar = new Car(3, 1, 0);
        newList.add(newCar);
        emptyQueue.enqueue(newCar);
        assertTrue(emptyQueue.getQueue().equals(newList));
    }

    @Test
    public void testDequeue() {
        Queue<Car> emptyQueue = new Queue<Car>();
        LinkedList<Car> newList = new LinkedList<Car>();
        Car newCar = new Car(3, 1, 0);
        newList.add(newCar);
        emptyQueue.enqueue(newCar);
        assertTrue(emptyQueue.getQueue().equals(newList));
        assertTrue(emptyQueue.dequeue() == newCar);
        newList.remove(0);
        assertTrue(emptyQueue.getQueue().equals(newList));
    }

    @Test
    public void testPeek() {
        Car newCar = new Car(3, 1, 0);
        Queue<Car> emptyQueue = new Queue<Car>();
        emptyQueue.enqueue(newCar);
        assertTrue(emptyQueue.peek() == newCar);
    }

    @Test
    public void testIsEmpty() {
        Queue<Car> emptyQueue = new Queue<Car>();
        assertTrue(emptyQueue.isEmpty());
        Car newCar = new Car(3, 1, 0);
        emptyQueue.enqueue(newCar);
        assertFalse(emptyQueue.isEmpty());
    }
}


// Junit tests for class Queue
// ◦ Constructor Queue() 1 point
// ◦ enqueue(e) 2 points
// ◦ dequeue() → e 2 points
// ◦ peek() → e 2 points
// ◦ isEmpty() → boolean