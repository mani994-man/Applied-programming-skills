class Solution {
    public void sortColors(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=nums.length;
        for(int x:nums){
            pq.offer(x);
        }
        int i=0;
        while(! pq.isEmpty()){
            nums[i++]=pq.poll();
        }
       

    }
}