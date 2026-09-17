/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        int i = 0;
        while(curr != null && i<k){
            prev = curr;
            curr = curr.next;
            i++;
        }
        if(i<k) return head;

        prev.next = null;

        ListNode rec = reverseKGroup(curr,k);
        ListNode res = reverse(head);
        head.next = rec;
        return res; 
    }
    public ListNode reverse(ListNode head){
        ListNode prevNode = null;
        ListNode currNode = head;
        while(currNode != null){
            ListNode temp = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = temp;
        }
        head = prevNode;
        return head;
    }
}