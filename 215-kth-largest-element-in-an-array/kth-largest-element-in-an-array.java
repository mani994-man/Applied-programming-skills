class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        // for(int i=0;i<n-k+1;i++){

        // }
        return nums[n-k];

        
    }
}