//这里需要自己实现栈或者使用UP之前讲解的自动扩容的数组实现的栈
//具体代码可以参考https://github.com/Acoinprogrammer/DataStructure/blob/Stack%EF%BC%88%E6%A0%88%EF%BC%89/AutoResizingArrayStack.java
import Stack.AutoResizingArray.stack;
//用栈实现的单向队列
public class queue {
    //使用两个栈模拟队列
    //一个InStack栈用于按照队列入队顺序添加元素
    //但是由于栈先进后出的顺序
    //所以还需要一个辅助栈OutStack用于恢复队列的顺序
    //size代表当前队列的元素个数
    //可以使用Java自带的类import java.util.Stack;但是由于其底层是继承了Vector这个老数组，其每个方法都实现了synchronized锁，锁的粒度很高，所以效率很低
    //这里UP就使使用自己实现的栈类了，并且大部分场景都需要进行扩容操作
    //所以当前的两个栈就是用动态数组实现的栈
    private stack InStack;
    private stack OutStack;
    private int size;
    //初始化队列
    public queue(){
        this.InStack = new stack();
        this.OutStack = new stack();
        size = 0;
    }
    //入队操作
    public void offer(int value){
        reverseStack(this.OutStack,this.InStack);
        this.InStack.push(value);
        size++;
    }
    //得到队列的头部元素
    //返回-1代表无元素
    public int peek(){
        if(isEmpty()) {
            return -1;
        }
        reverseStack(this.InStack,this.OutStack);
        return this.OutStack.peek();
    }
    //让队列头部元素出队
    //同理，返回-1代表无元素
    public int poll(){
        if(isEmpty()){
            return -1;
        }
        reverseStack(this.InStack,this.OutStack);
        return this.OutStack.pop();
    }
    //倒栈操作
    public void reverseStack(stack srcStack,stack destStack){
        while(!srcStack.isEmpty()){
            int Value = srcStack.pop();
            destStack.push(Value);
        }
    }
    //判断当前队列是否为空
    public boolean isEmpty(){
        return this.size==0;
    }
    //得到当前队列的元素个数
    public int size(){
        return this.size;
    }

}
