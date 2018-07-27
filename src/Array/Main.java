package Array;

/**
 * @author lihaocheng
 * @create 2018-07-22 上午12:52
 **/

public class Main {
    public static void main(String[] args) {
        Array arr=new Array(20);
        for(int i=0;i<10;i++){
            arr.addLast(i);

        }
        System.out.println(arr);
        arr.add(1,100);
        System.out.println(arr);
        System.out.println(arr.get(2));
        arr.set(2,133);
        System.out.println(arr.get(2));



    }

}
