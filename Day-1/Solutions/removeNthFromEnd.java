class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Dummy Node
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        
        // Length of the node
        int len=0;
        ListNode l =head;
        while(l!=null){
            len=len+1;
            l=l.next;
        }

        //Delete
        int d= len-n+1;
        ListNode prev=dummy,
            curr=head;
        
        int i=0;
        while(i<(d-1)){
            curr=curr.next;
            prev=prev.next;
            i=i+1;
        }
        prev.next=prev.next.next;

        return dummy.next;
      
    }
}
