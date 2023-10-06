class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        char c=needle.charAt(0);
        for(int i=0;i<n;i++){
            if(haystack.charAt(i)==c){
                if(i+m<=n && haystack.substring(i,i+m).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }   
}    