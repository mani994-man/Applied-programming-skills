class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i:nums){
            total+=i;

        }
        int ls=0;
        for(int i=0;i<n;i++){
            int rs=total-ls-nums[i];
            if(ls==rs){
                return i;
            }
            ls+=nums[i];
        }
        return -1;
    }
}