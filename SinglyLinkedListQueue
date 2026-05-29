//基于双向链表实现的单向队列
public class queue {
    //由于链表在空间上不是连续的，所以可以不需要像数组实现一样，指定Capacity，front，rear来维持队列的状态
    //创建一个节点类，代表每一个元素value及其下一个元素的节点指向next
    private class Node{
        int value;
        Node next;
        Node pre;
        public Node(){
        }
        public Node(int value){
            this.value = value;
            this.next = null;
        }
        public Node(int value,Node pre,Node next){
            this.value = value;
            this.pre = pre;
            this.next = next;
        }
    }
    //创建一个哨兵节点head，其下一个指向为头部元素节点
    //创建一个哨兵节点tail，其上一个指向为尾部元素节点
    //size代表当前链表的元素个数
    private Node head;
    private Node tail;
    private int size;
    //初始化队列
    public queue(){
        this.head = new Node(0,null,this.tail);
        this.tail = new Node(0,this.head,null);
        this.size = 0;
    }
    //入队操作
    //不需要返回值确认是否操作成功，因为链表空间状态不连续，是动态扩容的
    public void offer(int value){
        Node node = new Node(value,null,null);
        Node tailPre = this.tail.pre;
        tailPre.next = node;
        node.next = this.tail;
        node.pre = tailPre;
        this.tail.pre = node;
        this.size++;
    }
    //得到队列头部元素的操作
    //返回-1代表无元素，即队列为空
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return this.head.next.value;
    }
    //让队列头部出队
    //同理，-1代表无元素，即队列为空
    public int poll(){
        if(isEmpty()){
            return -1;
        }
        Node front = this.head.next;
        int frontValue = front.value;
        this.head.next = front.next;
        this.head.next.pre = this.head;
        this.size--;
        return frontValue;
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
