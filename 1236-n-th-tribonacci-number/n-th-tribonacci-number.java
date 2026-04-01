class Solution {
    public int tribonacci(int n) {
        if(n<2) return n;
        if(n==2) return 1;

        int f=0;
        int s=1;
        int t=1;
        for(int i=1;i<=n;i++){
            int total=f+s+t;
            f=s;
            s=t;
            t=total;
            total=f;
        }
        return f;

        
    }
}