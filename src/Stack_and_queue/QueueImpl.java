package Stack_and_queue;

public class QueueImpl {

    int[] arr = new int[5];
    int front = 0;
    int rear = -1;
    int size = 0;

    public void enqueue(int data){
        rear = (rear + 1) % 5;
        arr[rear] = data;
        size++;
    }

    public int dequeue(){
        int result = arr[front];
        front = (front + 1) % 5;
        size--;
        return result;
    }

    public void printer(){
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
    
}
