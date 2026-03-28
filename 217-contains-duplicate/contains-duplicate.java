class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hm=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hm.add(nums[i]);
        }
        if(n !=hm.size()){
            return true;
        }
        return false;
        
    }
}