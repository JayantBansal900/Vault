/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        //step 1 Inserting new Node B/w the nodes
        if(head == null) return null;
        Node curr = head;
        while(curr != null){
            Node temp = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = temp;
            curr = temp;
        }
        curr = head;
        //step 2 Setting random pointer of new Node
        while(curr != null){
            if(curr.next != null){
                if(curr.random != null){
                    curr.next.random = curr.random.next;
                }
            }
            curr = curr.next.next;
        }
        //step 3 Seprate both Linkedlist
        Node orig = head;
        Node copy = head.next;
        Node temp = copy;
        while(orig != null){
            orig.next = orig.next.next;
            if(temp.next != null){
                temp.next = temp.next.next;
            }
            orig = orig.next;
            temp = temp.next;
        }
        return copy;
    }
}