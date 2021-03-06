package Queue;

/**
 * @author lihaocheng
 * @create 2018-08-03 下午11:48
 **/

public class LoopQueue<E> implements Queue<E>{

    private E[] data;
    private int front,tail;
    private int size;

    public LoopQueue(int capacity){
        data= (E[]) new Object[capacity+1];
        front=0;
        tail=0;
        size=0;
    }

    public LoopQueue(){
        this(10);
    }

    public int getCapacity(){
        return data.length-1;
    }

    @Override
    public void enqueue(E e) {


    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public int getFront() {
        return front;
    }

    public int getTail(){
        return tail;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front==tail;
    }
}
