class Solution {
    public int pairSum(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while(head !=null){
            list.add(head.val);
            head=head.next;
        }
        int i=0,
            j=list.size()-1;
        int max=Integer.MIN_VALUE;

        // TC:O(n) SC: O(n)

        while(i<j){
            int sum=list.get(i)+list.get(j);
            if(max<sum){
                max=sum;
            }
            //max=Math.max(max,sum);
            i=i+1;
            j=j-1;
            

        }
        
     
    return max;

    }
}
