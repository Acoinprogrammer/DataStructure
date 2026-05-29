//基于动态数组实现的自动扩容单向队列
public class queue {
    //创建一个数组array
    //队列的容量大小Capacity
    //队列头部指针front
    //队列尾部指针rear
    //实际元素个数size
    //空参构造下的数组Not_Param_array
    private int[] array;
    private int Capacity;
    private int front;
    private int rear;
    private int size;
    private static final int Not_Param_array[] = new int[0];
    //空参构造初始化队列，先让数组array指向无参构造数组Not_Param_array，等待第一次往队列尾部添加元素时再进行
    //虽然new int【0】指明数组长度为0，但实际上这个数组还是占用了一定的内存，所以对于无参构造数组加个static final修饰符
    //不仅能减少空间开销，而且能减少第一次扩容操作所导致的时间开销
    public queue(){
        this.array = Not_Param_array;
    }
    //有参构造初始化队列
    public queue(int Capacity){
        this.array = new int[Capacity];
        this.Capacity = Capacity;
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }
    //往队列尾部添加元素
    //如果发现队列已满，则进行扩容
    public void offer(int value){
        if(this.size==this.Capacity || this.Capacity==this.rear) {
            grow();
        }
        this.array[this.rear]=value;
        this.rear++;
        this.size++;
    }
    //扩容逻辑
    //先计算出扩容后1.5的容量大小newCapacity
    //再创建一个newCapacity容量大小的数组
    //再把原数组进行拷贝
    //让原数组的指向改变为new_array
    public void grow(){
        if(Capacity==0){
            int newCapacity = 10;
            this.array = new int[newCapacity];
            this.Capacity = newCapacity;
            return;
        }
        int newCapacity = (this.Capacity>>1)+this.Capacity;
        int[] new_array = new int[newCapacity];
        System.arraycopy(this.array,this.front,new_array,0,this.size);
        this.front = 0;
        this.rear = this.size;
        this.array = new_array;
        this.Capacity = newCapacity;
    }

    //获取队列头部元素
    //如果队列为空，则返回-1
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return this.array[this.front];
    }
    //让队列的头部元素出队
    //同理，如果队列为空，则返回-1
    //否则先让头部元素出队
    //然后再让front+1
    //最后再把front-rear长度范围内的元素全部移动到数组的头部，也就是下标为0的位置开始
    public int poll(){
        if(isEmpty()){
            return -1;
        }
        int frontValue = this.array[this.front];
        this.array[this.front] = 0;
        this.front++;
        this.size--;
        return frontValue;
    }
    //判断队列是否为空
    public boolean isEmpty(){
        return this.size==0;
    }
    //得到当前队列的元素个数
    public int size(){
        return this.size;
    }
}
