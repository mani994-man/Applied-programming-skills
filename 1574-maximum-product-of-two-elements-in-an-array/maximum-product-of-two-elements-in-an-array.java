class Solution {
    public int maxProduct(int[] nums) { 
       
        int n=nums.length;
        int max=0;
        for(int i=0;i<n-1;i++){
            int sum=0;
            for(int j=i+1;j<n;j++){
                int a=nums[i]-1;
                int b=nums[j]-1;
                
                if(a*b > max) {
                    sum=a*b;
                    max=Math.max(sum,max);

                }
            }

        }
        return max;
        
    }
}