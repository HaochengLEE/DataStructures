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
        return array.removeFrist();
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

    public int getCapacity(){
        return array.getCapacity();
    }

    public String toString(){
        StringBuilder res=new StringBuilder();
        res.append("Queue");
        res.append("front[");
        for(int i=0;i<array.getSize();i++){
            res.append((array.get(i)));
            if(i!=array.getSize()-1){
                res.append(",");
            }


        }
        res.append("]tail");
        return res.toString();
    }
}
