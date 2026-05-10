class Solution {
    public String reverseWords(String s) {
        String b=s.trim();
        String[]arr=b.split("\\s+");
        
        String a="";
        for(int i=arr.length-1;i>=0;i--){
            a+=arr[i];
            if(i !=0){
                a+=" ";
            }
        }
        return a;

        
    }
}