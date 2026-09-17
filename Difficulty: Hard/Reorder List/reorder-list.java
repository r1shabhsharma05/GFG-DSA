/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public void reorderList(Node head) {
       Node slow = head; 
       Node fast = head;
       while(fast != null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }
       Node mid = slow;
       Node curr = mid.next;
       mid.next = null;

       
       Node prev = null;
       Node next;
       while(curr != null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       Node left = head;
       Node right = prev;
       Node nextL;
       Node nextR;
       while(left != null && right !=null){
           nextL = left.next;
           left.next = right;
           nextR = right.next;
           right.next = nextL;
           right = nextR;
           left = nextL;
       }
       return;
    }
}