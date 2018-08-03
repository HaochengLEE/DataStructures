import Array.Array;
import Array.Student;
import Queue.ArrayQueue;
import Stack.ArrayStack;

/**
 * @author lihaocheng
 * @create 2018-07-22 上午12:52
 **/

public class Main {
    public static void main(String[] args) {

// 数组
// Array<Integer> arr=new Array<Integer>();
//        for(int i=0;i<10;i++){
//            arr.addLast(i);
//            System.out.println(arr);
//
//        }
//        System.out.println(arr);
//        arr.add(1,100);
//        System.out.println(arr);
//        arr.remove(1);
//        System.out.println(arr);
//        arr.remove(2);
//        System.out.println(arr);
//        arr.remove(3);
//        System.out.println(arr);
//        arr.remove(4);
//        System.out.println(arr);
//
//        System.out.println(arr);
//        System.out.println(arr.get(2));
//
//        System.out.println(arr);
//
//        Array<Student> arr1= new Array<Student>();
//        arr1.addLast(new Student("Lihaocheng",100));
//        arr1.addLast(new Student("Licheng",101));
//        arr1.addLast(new Student("Lihao",110));
//        System.out.println(arr1);
//栈
//        ArrayStack<Integer> stack=new ArrayStack<Integer>();
//
//        for(int i=0;i<5;i++){
//            stack.push(i);
//            System.out.println(stack);
//
//        }
//
//        stack.pop();
//        System.out.println(stack);
        //队列
        ArrayQueue<Integer> queue=new ArrayQueue<Integer>();
        for(int i=0;i<5;i++){
            queue.enqueue(i);
            System.out.println(queue);

        }

        queue.dequeue();
        System.out.println(queue);






    }


}
