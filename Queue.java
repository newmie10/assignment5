import java.util.LinkedList;

public class Queue<e>{
    private LinkedList<e>  elements;
    
    public Queue() {
        elements = new LinkedList<>();
    }

    public LinkedList<e> getQueue() {
        return elements;
    }

    public void enqueue(e car) {
        elements.addLast(car);
    }

    public e dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue empty");
        }
        return elements.removeFirst();
    }

    public e peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue empty");
        }
        return elements.getFirst();
    }   
    

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public boolean equals(LinkedList<e> a) {
        e current1 = elements.get(0);
        e current2 = a.get(0);
        int index = 1;
        
        if (elements.size() == a.size()) {
            while (index < elements.size()) {
                if (current1 == current2) {
                    current1 = elements.get(index);
                    current2 = a.get(index);
                    index += 1;
                } else {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
        return true;
    }
}
