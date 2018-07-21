package Array;

/**
 * @author lihaocheng
 * @create 2018-07-22 上午12:52
 **/

public class Main {
    public static void main(String[] args) {
        double[] arr=new double[10];
        int[] scores=new int[]{100,99,66};
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i]);
        }


    }

}
