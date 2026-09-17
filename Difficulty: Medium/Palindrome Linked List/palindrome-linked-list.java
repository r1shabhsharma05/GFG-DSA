/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        Node prev = null;
        Node curr = slow;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        Node first = head;
        Node second = prev;
        while(second != null){
            if(first.data!= second.data){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}