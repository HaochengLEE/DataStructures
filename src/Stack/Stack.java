package Stack;

/**
 * @author lihaocheng
 * @create 2018-07-31 上午12:26
 **/

public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();


}
