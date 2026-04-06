class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int f=(n*(n+1))/2;
        int e=0;
        for(int i=0;i<n;i++){
            e+=nums[i];

        }
         sum=f-e;

        return sum;



        
    }
}