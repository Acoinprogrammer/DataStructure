//固定容量数组实现的单向队列
public class queue {
    //创建一个数组array
    //固定容量大小Capacity
    //实际元素个数size
    //队列头部指针front
    //队列尾部指针rear
    private int[] array;
    private int Capacity;
    private int size;
    private int front;
    private int rear;
    //初始化队列
    public queue(int Capacity){
        this.array = new int[Capacity];
        this.Capacity = Capacity;
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }
    //入队操作
    //由于容量固定，所以对于入队操作需要有返回值代表是否入队成功
    public boolean offer(int value){
        if(this.size==this.Capacity) {
            return false;
        }
        this.array[this.rear]=value;
        this.rear = (this.rear+1)%this.Capacity;
        this.size++;
        return true;
    }
    //得到队列头部元素操作,-1代表无元素
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return this.array[this.front];
    }
    //出队操作,-1代表无元素
    public int poll(){
        if(isEmpty()){
            return -1;
        }
        int frontValue = this.array[this.front];
        this.front = (this.front+1)%this.Capacity;
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
