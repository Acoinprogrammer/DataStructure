//数组实现栈（有容量限制）
public class FiniteArrayStack {
    //创建一个数组
    //top代表栈顶
    //size代表当前栈的元素个数
    //Capacity代表栈的容量
    private int[] array;
    private int top;
    private int size;
    private int Capacity;
    //初始化栈
    public FiniteArrayStack(int Capacity){
        this.array = new int[Capacity];
        this.Capacity = Capacity;
        this.top = -1;
        this.size = 0;
    }
    //压栈操作
    public boolean push(int value){
        if(this.Capacity==this.size){
            return false;
        }
        this.top++;
        this.array[this.top] = value;
        this.size++;
        return true;
    }
    //得到栈顶元素操作
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return this.array[this.top];
    }
    //出栈操作
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int topValue = this.array[this.top];
        this.array[this.top]=0;
        this.top--;
        this.size--;
        return topValue;
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return this.size==0;
    }
    //获取栈内元素个数
    public int size(){
        return this.size;
    }
}
