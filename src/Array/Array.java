package Array;

/**
 * @author lihaocheng
 * @create 2018-07-22 下午8:21
 **/

public class Array {
    private int arr[];
    private int size;
    /*
     构造函数
     */
    public Array(int count){
        arr=new int[count];
        size=0;


    }
    public  Array(){
        this(10);
    }
    /*
     获取元素个数
     */
    public int getSize(){
        return size;
    }

    /*
     获取数组容量
     */
    public int getCount(){
        return arr.length;
    }

    /*
     是否为空
     */
    public boolean IsEmpty(){
        return size==0;
    }
    /*
     尾部添加元素
     */
    public void addLast(int number){
        add(size,number);
    }
    /*
     插入元素
     */
    public void add(int num,int e){
        if(num==arr.length) throw new IllegalArgumentException("AddLast Failed , It is Full of Array!");
        if(num==size+1){
              addLast(e);
        }
        for(int i=size;i>=num;i--){
            arr[i+1]=arr[i];
        }
        arr[num] =e;
        size++;
    }
    //获取索引位置的元素
    int get(int index){
        if(index<0||index>=size){
            throw new IllegalArgumentException("Fail");
        }
        return arr[index];

    }
    //改变索引位置的元素
    int set(int index,int e){
        if(index<0||index>=size){
            throw new IllegalArgumentException("Fail");
        }
        return arr[index]=e;

    }

    @Override
    public String toString(){
        StringBuilder res=new StringBuilder();
        res.append(String.format("Array:size=%d,capacity=%d\n",size,arr.length));
        res.append('[');
        for(int i=0;i<size;i++){
            res.append((arr[i]));
            if(i!=size-1){
                res.append(",");
            }


        }
        res.append("]");
        return res.toString();
    }


}
