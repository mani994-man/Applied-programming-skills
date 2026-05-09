class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        Arrays.sort(people);
        int l=0;
        int r=n-1;
        int c=0;
        if(n==1){
            return 1;
        }
        while(l<=r){
            if(people[l]+people[r]<=limit){
                c+=1;
                l++;
                r--;

            }
            else{
                r--;
                c+=1;
            }
        }
        return c;
        
       

        
    }
}