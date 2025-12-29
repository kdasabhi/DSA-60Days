class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int i=0,
            j=list.size()-1;
        
        while(i<j){
            if(list.get(i)==list.get(j)){
                
                i++;
                j--;
            }
            else{
                return false;
            }

        }
        return true;

        
    }
}
