class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        ArrayList<Integer> li=new ArrayList<>();


        for(int i=0;i<n;i++){
            if(nums[i]==target){
                li.add(i);
            }
        }
        return li;


        
    }
}