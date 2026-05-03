import java.util.ArrayList;

//使用自动扩容数组（在java中有现成的STL，即ArrayList）
public class AutoResizingArrayStack {
    //创建一个集合。由于集合底层是数组实现，并且集合会自动扩容，所以使用集合来模拟可变容量栈
    //top代表栈顶
    //同时我们不用再自定义个一个size，因为有集合的size（）方法可以替代且查询一样为O （1）
    private ArrayList<Integer> array;
    private int top;
    //初始化栈
    public AutoResizingArrayStack(){
        this.array = new ArrayList<>();
        this.top = -1;
    }
    //压栈操作
    public void push(int value){
        this.array.add(value);
        this.top++;
    }
    //得到栈顶元素操作
    public int peek(){
        if(isEmpty()){return -1;}
        int topValue = this.array.get(this.top);
        return topValue;
    }
    //出栈操作
    public int pop(){
        if(isEmpty()){return -1;}
        int topValue = this.array.remove(this.top);
        this.top--;
        return topValue;
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return this.array.size()==0;
    }
    //获取栈内元素个数
    public int size(){
        return this.array.size();
    }
}
