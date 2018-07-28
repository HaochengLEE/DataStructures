package Array;

/**
 * @author lihaocheng
 * @create 2018-07-22 下午8:21
 **/

public class Array<E> {
    private E arr[];
    private int size;
    /*
     构造函数
     */
    public Array(int count){
        arr=(E[])new Object[count];
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
    public void addLast(E number){
        add(size,number);
    }
    /*
     插入元素
     */
    public void add(int num,E e){
//        System.out.println(arr.length);
//        System.out.println(size);
        if(num<0||num>size){
            throw new IllegalArgumentException("输入值不合法");

        }
        if(size+1==arr.length) {
            System.out.println("容量翻倍");
            resize(20);
        }

        for(int i=size;i>=num;i--){
            arr[i+1]=arr[i];
        }
        arr[num] =e;
        size++;
    }
    //获取索引位置的元素
    public E get(int index){
        if(index<0||index>=size){
            throw new IllegalArgumentException("Fail");
        }
        return arr[index];

    }
    //改变索引位置的元素
    public E set(int index,E e){
        if(index<0||index>=size){
            throw new IllegalArgumentException("Fail");
        }
        return arr[index]=e;

    }

    //是否存在某一个元素
    public boolean contains(E e){
        for(int i=0;i<size;i++){
            if(arr[i].equals(e)){
                return true;
            }

        }
        return false;
    }

    //查找元素并返回索引值，不存在返回-1
    public int find(E e){
        for(int i=0;i<size;i++){
            if(arr[i].equals(e)){
                return i;
            }

        }
        return -1;
    }

    //删除第i位置的元素
    public E remove(int index){
        if(index<0||index>=size){
            throw new IllegalArgumentException("Fail");
        }
        E ret=arr[index];
        for(int i=index;i<size;i++){
            arr[i]=arr[i+1];
        }
        size--;
        if(size--==arr.length/4&&arr.length/2!=0){
            System.out.println("删除一半内存");
            resize(arr.length/2);
        }

        return ret;

    }

    //删除第一个元素
    public E removeFrist(){
        return remove(0);
    }

    //从数组中删除元素e
    public boolean removeElement(E e){
        int index=find(e);
        if(index!=-1){
            remove(index);
            return true;
        }
        return false;
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

    private void resize(int newCapacity){
        E[] newData=(E[])new Object[newCapacity];
        for (int i=0;i<size;i++){
            newData[i]=arr[i];
        }
        arr=newData;
    }


}
