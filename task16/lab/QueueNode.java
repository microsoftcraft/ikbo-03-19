package task16.lab;

public class QueueNode {
    private  QueueNode next,prev;
    private Order value;
    
    QueueNode(QueueNode prev, Order value, QueueNode next)
    {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
