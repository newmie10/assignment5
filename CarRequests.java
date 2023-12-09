public class CarRequests {

    private Queue<Integer> newQ;
    
    public CarRequests() {
        this.newQ = new Queue<Integer>();
    }

    public void addRequest(int x) {
        newQ.enqueue(x);
    }

    public int getRequest() {
        return newQ.dequeue();
    }

    public boolean hasPendingRequests() {
        return !newQ.isEmpty();
    }
}
