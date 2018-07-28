package Array;

import org.junit.Test;

/**
 * @author lihaocheng
 * @create 2018-07-28 下午12:34
 **/

public class Student {
    private String name;
    private int score;

    public Student(String stname,int stscore){
        name    =   stname;
        score   =   stscore;
    }
    @Override
    public String toString(){
        return String.format("Student:(name=%s,score=%d)", name ,score);

    }

    @Test
    public static void main(String[] args) {
        Array<Student> arr= new Array<Student>();
        arr.addLast(new Student("Lihaocheng",100));
        arr.addLast(new Student("Licheng",101));
        arr.addLast(new Student("Lihao",110));
        System.out.println(arr);

    }




}
