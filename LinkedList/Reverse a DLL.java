class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode last=null;
        DLLNode curr=head;
        while(curr!=null){
            last=curr.prev;
            curr.prev=curr.next;
            curr.next=last;
            curr=curr.prev;
            
        }
        if (last != null) {
            head = last.prev; // new head is the node that was previously the tail
        }
        return head;
    }
}
