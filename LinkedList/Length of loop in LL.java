/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

// Function should return the length of the loop in LL.

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return findLength(slow);
            }
        }
        return 0;
    }
    private int findLength(Node temp){
        int cnt=1;
        Node curr=temp;
        while(curr.next!=temp){
            cnt++;
            curr=curr.next;
        }
        return cnt;
    }
}
