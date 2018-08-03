package Queue;

/**
 * @author lihaocheng
 * @create 2018-08-02 下午11:39
 **/

public interface Queue <E>{


    void enqueue(E e);

    E dequeue();

    int getFront();

    int getSize();

    boolean isEmpty();

}
