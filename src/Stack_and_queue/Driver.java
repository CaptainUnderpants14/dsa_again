package Stack_and_queue;

public class Driver {
    public static void main(String[] args) {
        QueueImpl stack = new QueueImpl();
        stack.enqueue(4);
        stack.enqueue(5);
        stack.enqueue(6);
        stack.enqueue(7);
        stack.enqueue(8);
        System.out.println("Removed: " + stack.dequeue());
        stack.enqueue(10);
        // System.out.println("Removed: " + stack.dequeue());
        // System.out.println("Removed: " + stack.dequeue());
        // System.out.println("Removed: " + stack.dequeue());
        // System.out.println("Removed: " + stack.dequeue());
        // System.out.println("Removed: " + stack.dequeue());
        stack.printer();
        
    }
}
