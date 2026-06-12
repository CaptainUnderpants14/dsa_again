package Stack_and_queue;

public class StackImpl {
    
    public int[] arr = new int[5]; 
    int size = arr.length;
    int top = -1;

    public void pushElement(int data){
        top++;
        if (top < size)
            arr[top] = data;
        else
            System.out.println("Stack Overflow");
    }

    public int pop(){
        int result = arr[top];
        top--;
        return result;
    }

    public int peek(){
        return arr[top];
    }

    public void printer(){
        while (top > -1){
            System.out.print(arr[top] + " ");
            top--;
        }
    }
}
