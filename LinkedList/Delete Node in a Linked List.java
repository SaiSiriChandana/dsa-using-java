/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {// access to the first node of head is not given
        node.val=node.next.val;// copy the value from the next node to the current node
        node.next=node.next.next;// Linking the current node to the node after the next node
        
        
    }
}
