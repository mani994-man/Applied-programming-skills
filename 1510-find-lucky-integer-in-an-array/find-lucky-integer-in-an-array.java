class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();

        
        for(int i=0;i<n;i++){
            int c=arr[i];
            hm.put(c,hm.getOrDefault(c,0)+1);


        }
        int max=0;

        for(int x : hm.keySet()){
            int val=hm.get(x);
            if(val == x){
                max=Math.max(max,x);
            }
        }

       

        if(max > 0){
            return max;
        }
        return -1;











        
    }
}