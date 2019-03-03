package www.bit.ds;


class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //若给定的恰好是头节点
        while(head !=null && head.val==val){
            head=head.next;
        }
        if(head==null){
            //表示当前链表中已经没有节点
            return null;
        }
        //当前链表不为空且第一个节点绝对不是给定的值val
        //前驱节点
        ListNode prev=head;
        //1->6->6->2
        while(prev.next !=null){
            if(prev.next.val==val){
                prev.next=prev.next.next;
            }else{
                prev=prev.next;
            }
        }
        return head;
    }
    /*
    使用虚拟节点
    public ListNode removeElements(ListNode head, int val) {
        //创建一个虚拟节点
        ListNode dummyHead=new ListNode(-1);
        dummyHead.next=head;
        //此时链表中都有前驱节点
        ListNode prev=dummyHead;
       while(prev.next !=null){
           if(prev.next.val==val){
               prev.next=prev.next.next;
           }else{
               prev=prev.next;
           }
       }
       return dummyHead.next;
    }
    */
    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(6);
        ListNode node4=new ListNode(3);
        ListNode node5=new ListNode(4);
        ListNode node6=new ListNode(5);
        ListNode node7=new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        Solution solution=new Solution();
        ListNode result=solution.removeElements(node1,6);
        for (ListNode temp = result;temp!=null;temp=temp.next) {
            System.out.print(temp.val+"->");
        }
    }
}
