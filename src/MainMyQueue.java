public class MainMyQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        Customer aCust = new Customer();
        aCust.setName("Alfred");
        aCust.setTime("13:15");

        Customer bCust = new Customer();
        bCust.setName("Bernie");
        bCust.setTime("09:36");

        Customer cCust = new Customer();
        cCust.setName("Cristian");
        cCust.setTime("16:32");

        Customer dCust = new Customer();
        dCust.setName("Dami");
        dCust.setTime("14:05");

        queue.enqueue(aCust);
        queue.enqueue(bCust);
        queue.enqueue(cCust);
        queue.enqueue(dCust);

        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Is the queue full? " + queue.isFull());

        queue.dequeue();        //will remove Alfred

        while(!queue.isEmpty()){
            Customer value = queue.dequeue();
            System.out.println(value);
        }
    }
}
