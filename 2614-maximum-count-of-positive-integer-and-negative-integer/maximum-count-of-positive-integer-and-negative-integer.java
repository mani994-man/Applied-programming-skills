class Solution {
    public int maximumCount(int[] nums) {
        int n=0;
        int p=0;
        for(int i:nums){
            if(i<0){
                n+=1;
            }
            else if(i==0){
                continue;
            }
            else{
                p+=1;
            }
        }
        if(n<=p){
            return p;
        }
        return n;
        
    }
}