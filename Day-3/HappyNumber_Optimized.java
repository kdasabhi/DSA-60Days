class Solution {
    public int square(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int FP=n;
        int SP=n;
        while(FP != 1){
            FP= square(square(FP));
            SP=square(SP);
            if(FP==1){
                return true;
            }
           if(FP==SP){
                return false;
            }   
        }
        return true;
    }
}
