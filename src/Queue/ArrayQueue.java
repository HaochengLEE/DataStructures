package Queue;

import Array.Array;

/**
 * @author lihaocheng
 * @create 2018-08-02 下午11:46
 **/

public class ArrayQueue<E> implements Queue<E>{
    Array<E> array;
    public ArrayQueue(int capacity){
        array=new Array<E>(capacity);
    }

    public ArrayQueue(){
        array=new Array<E>();

    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);


    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E getFront() {
        return null;
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }
}
