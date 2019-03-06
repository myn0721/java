package www.bit.ds;

/**
 * @author mayanni
 * @date 2019-03-06 18:38
 */

//火车类
public class LinkedList {
    //火车头节点和火车长度
    private  Node head;
    private  int size;
    public LinkedList(){
        head=null;
        size=0;
    }
    //每个节点类
    private  class Node{
        Object data;
        Node next;

        public Node(Object data) {
            this.data=data;
        }
        public Node(Object data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    public  void addFirst(Object data){
        //创建新节点存放数据
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }


    //在任意位置插入节点
    public void add(int index,Object data){
        //判断index是否合法
        if(index <0 || index >= size){
            throw new IndexOutOfBoundsException("index Illegal!");
        }
        //index==0相当于头插，直接调用addFirst（）
        if(index==0){
            addFirst(data);
        }
        //找到index的前驱节点，默认重头开始
        Node prev=head;
        //走几步，找到前驱节点
        for (int i = 0; i <index-1 ; i++) {
            prev=prev.next;
        }
        //创建新节点
        Node newNode=new Node(data);

        newNode.next=prev.next;
        prev.next=newNode;
        size++;
    }
}
