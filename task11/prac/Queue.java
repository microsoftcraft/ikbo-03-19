package task11.prac;

public interface Queue
{
    boolean enqueue  (int n);
    int element();
    int dequeue ();
    int size();
    boolean isEmpty ();
    void clear  ();
}
