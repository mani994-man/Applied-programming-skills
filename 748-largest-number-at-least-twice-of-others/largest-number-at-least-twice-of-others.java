class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int n=nums.length;

        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>largest){
                second=largest;
                largest=nums[i];
            }
            else if( nums[i]>second){
                second=nums[i];
            }
        }
        if(largest >=2*second){
             for(int i=0;i<n;i++){
            if(largest ==nums[i]){
                return i;
            }
        }
        
        }
         return -1;     
    }
}
    