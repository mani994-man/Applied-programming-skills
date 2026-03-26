class Solution {
    public boolean isPalindrome(int x) {

        
if(x<0){
    return false;
}
String s="";
String a=String.valueOf(x);
for(int i=a.length()-1;i>=0;i--){
    s+=a.charAt(i);

}
if(a.equals(s)){
    return true;
}
else{
    return false;
}



        
    }
}