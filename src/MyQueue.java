public class MyQueue {
    private Customer[] cust;
    private int front;
    private int rear;
    private int count;

    public MyQueue(){
        cust = new Customer[20];
        front = 0;  //remove items from in front of the queue
        rear = 0;   //add items from behind the queue
        count = 0;  //indicates the index of the items in the array
    }

    //isEmpty, isFull, enqueue, dequeue

    public boolean isEmpty(){
        if(count == 0){
            return true;
        }
        else return false;
    }

    public boolean isFull(){
        if(front == rear && count > 0){
            return true;
        } else return false;
    }

    public void enqueue(Customer element){
        cust[rear] = element;
        rear = (rear + 1) % 20;
        count = count + 1;
    }

    public Customer dequeue(){
        Customer value = cust[front];
        front = (front + 1) % 20;
        count = count - 1;
        return value;
    }
}
